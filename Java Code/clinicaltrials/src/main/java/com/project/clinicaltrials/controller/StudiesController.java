package com.project.clinicaltrials.controller;

import com.google.gson.Gson;
import com.project.clinicaltrials.model.*;
import com.project.clinicaltrials.repository.ConditionsRepository;
import com.project.clinicaltrials.repository.StudiesRepository;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.gson.GsonProperties;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.geom.AreaOp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;


@RestController
public class StudiesController {

    @Autowired
    private StudiesRepository studiesRepository;

    @Autowired
    private ConditionsRepository conditionsRepository;


    @RequestMapping(value = "/getAllStudies/{page}/{size}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public List<Studies> getAllStudies(@PathVariable int page, @PathVariable int size) {

        List<Studies> studiesList =  studiesRepository.findAll(PageRequest.of(page, size)).getContent();
        return studiesList;
    }


    @RequestMapping(value = "/getStudiesByStartDate/{startDate}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public List<Studies> getStudiesByStartDate(@PathVariable String startDate) {

        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        List<Studies> studiesList =  studiesRepository.findAllByStartDate(date);
        return studiesList;
    }



    @RequestMapping(value = "/getStudiesByStartDateToSheet/{startDate}/{endDate}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public List<Studies> getStudiesByStartDateToSheet(@PathVariable String startDate, @PathVariable String endDate) throws ParseException, IOException {

        String[] columns = {"Rank", "NCT Number", "Title", "Acronym", "Status", "Study Results", "Conditions",
        "Interventions", "Outcome Measures", "Sponsor/Collaborators", "Gender", "Age", "Phases", "Enrollment",
        "Funded Bys", "Study Type", "Study Designs", "Other IDs", "Start Date", "Primary Completion Date",
        "Completion Date", "First Posted", "Results First Posted", "Last Update Posted", "Locations", "Study Documents", "URL"};

        Date date_Start = new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
        Date date_End = new SimpleDateFormat("yyyy-MM-dd").parse(endDate);


        List<Studies> studiesList =  studiesRepository.findByStartDateBetween(date_Start, date_End);


        // Create a Workbook
        Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file

        /* CreationHelper helps us create instances of various things like DataFormat,
           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
        CreationHelper createHelper = workbook.getCreationHelper();

        // Create a Sheet
        Sheet sheet = workbook.createSheet("Start Date");

        // Create a Font for styling header cells
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.BLACK.getIndex());

        // Create a CellStyle with the font
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        // Create a Row
        Row headerRow = sheet.createRow(0);

        // Create cells
        for(int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }

        // Create Cell Style for formatting Date
        CellStyle dateCellStyle = workbook.createCellStyle();
        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("yyyy-MM-dd"));

        // Create Other rows and cells with Studies data
        int rowNum = 1;
        for(Studies studies: studiesList) {


            List<BrowseConditions> conditionsList =  studies.getBrowseConditionsByNctId();


            for(BrowseConditions browseConditions: conditionsList){

             String mesh_term = browseConditions.getMeshTerm();
             CharSequence seq = "Alzheimer";
             boolean bool_Alzimer = mesh_term.contains(seq);

             if(bool_Alzimer){

                 //content of the intervention column
                 List<Interventions> interventionsList = studies.getInterventionsByNctId();
                 int size_interventions = interventionsList.size();
                 String interventions_type_name_discription = "";

                 for(Interventions interventions: interventionsList){
                     size_interventions = size_interventions -1;
                     interventions_type_name_discription += interventions.getInterventionType() + ": " + interventions.getName() +" ";
//                             + interventions.getDescription();
                     if (size_interventions > 0){
                         interventions_type_name_discription += "| ";
                     }

                 }



                 //content of the
                 String outcome_Measurements = "";
                 List<ResultGroups> resultGroupsList = studies.getResultGroupsByNctId();
                 System.out.println("fiiiiigh"+ resultGroupsList.size());
                 for(ResultGroups resultGroups: resultGroupsList){
                   Collection<OutcomeMeasurements> outcomeMeasurementsCollection = resultGroups.getOutcomeMeasurementsById();
                     int size_outcomMeasurements = outcomeMeasurementsCollection.size();
                     System.out.println("hiiiiiiiiii"+ size_outcomMeasurements);

                     for(OutcomeMeasurements outcomeMeasurements: outcomeMeasurementsCollection){
                         size_outcomMeasurements = size_outcomMeasurements -1;
                         outcome_Measurements += outcomeMeasurements.getTitle()+" ";

                         if(size_outcomMeasurements > 0){
                             outcome_Measurements += "| ";

                         }

                     }


                 }








                 Row row = sheet.createRow(rowNum++);

                 row.createCell(0)
                         .setCellValue(rowNum-1);

                 row.createCell(1)
                         .setCellValue(studies.getNctId());

                 row.createCell(2)
                         .setCellValue(studies.getBriefTitle());

                 row.createCell(3)
                         .setCellValue(studies.getAcronym());

                 row.createCell(4)
                         .setCellValue(studies.getOverallStatus());

                 row.createCell(6)
                         .setCellValue(browseConditions.getMeshTerm());

                 row.createCell(7)
                         .setCellValue(interventions_type_name_discription);

                 row.createCell(8)
                         .setCellValue(outcome_Measurements);



            /*row.createCell(4)
                    .setCellValue(studies.getFacilitiesByNctId().get(0).getStatus());

            row.createCell(6)
                    .setCellValue(studies.getConditionsByNctId().get(0).getName());

            row.createCell(7)
                    .setCellValue(studies.getInterventionsByNctId().get(0).getInterventionType() + ":"
                            + studies.getInterventionsByNctId().get(0).getName());*/

            /*row.createCell(8)
                    .setCellValue(studies.getOutcomeMeasurementsByNctId().get(0).getTitle());*/

            /*row.createCell(9)
                    .setCellValue(studies.getSponsorsByNctId().get(0).getName());

            row.createCell(10)
                    .setCellValue(studies.getEligibilitiesByNctId().get(0).getGender());*/

                 row.createCell(12)
                         .setCellValue(studies.getPhase());

//            row.createCell(13)
//                    .setCellValue(studies.getEnrollment());

                 row.createCell(15)
                         .setCellValue(studies.getStudyType());

                 Cell startDateCell = row.createCell(18);
                 startDateCell.setCellValue(studies.getStartDate());
                 startDateCell.setCellStyle(dateCellStyle);

                 Cell primaryCompletionDate = row.createCell(19);
                 primaryCompletionDate.setCellValue(studies.getPrimaryCompletionDate());
                 primaryCompletionDate.setCellStyle(dateCellStyle);

                 Cell completionDate = row.createCell(20);
                 completionDate.setCellValue(studies.getCompletionDate());
                 completionDate.setCellStyle(dateCellStyle);

                 Cell firstPostedDate = row.createCell(21);
                 firstPostedDate.setCellValue(studies.getStudyFirstPostedDate());
                 firstPostedDate.setCellStyle(dateCellStyle);

                 Cell resultsFirstPostedDate = row.createCell(22);
                 resultsFirstPostedDate.setCellValue(studies.getResultsFirstPostedDate());
                 resultsFirstPostedDate.setCellStyle(dateCellStyle);

                 Cell lastUpdatePostedDate = row.createCell(23);
                 lastUpdatePostedDate.setCellValue(studies.getLastUpdatePostedDate());
                 lastUpdatePostedDate.setCellStyle(dateCellStyle);

            /*row.createCell(25)
                    .setCellValue(studies.getDocumentsByNctId().get(0).getDocumentType());*/

            /*row.createCell(26)
                    .setCellValue(studies.getDocumentsByNctId().get(0).getUrl());*/
             }



             }
            }


        // Resize all columns to fit the content size
        for(int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        File file = new File("src/main/resources/public/start_date_sheet.xlsx");
        FileOutputStream fileOut = new FileOutputStream(file);
        workbook.write(fileOut);
        fileOut.close();

        // Closing the workbook
        workbook.close();


        return studiesList;
    }

}
