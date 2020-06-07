package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "calculated_values", schema = "ctgov", catalog = "AACT")
public class CalculatedValues {
    private int id;
    //private String nctId;
    private Integer numberOfFacilities;
    private Integer numberOfNsaeSubjects;
    private Integer numberOfSaeSubjects;
    private Integer registeredInCalendarYear;
    private Date nlmDownloadDate;
    private Integer actualDuration;
    private Boolean wereResultsReported;
    private Integer monthsToReportResults;
    private Boolean hasUsFacility;
    private Boolean hasSingleFacility;
    private Integer minimumAgeNum;
    private Integer maximumAgeNum;
    private String minimumAgeUnit;
    private String maximumAgeUnit;
    private Integer numberOfPrimaryOutcomesToMeasure;
    private Integer numberOfSecondaryOutcomesToMeasure;
    private Integer numberOfOtherOutcomesToMeasure;
    private Studies studiesByNctId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*@Basic
    @Column(name = "nct_id")
    public String getNctId() {
        return nctId;
    }

    public void setNctId(String nctId) {
        this.nctId = nctId;
    }*/

    @Basic
    @Column(name = "number_of_facilities")
    public Integer getNumberOfFacilities() {
        return numberOfFacilities;
    }

    public void setNumberOfFacilities(Integer numberOfFacilities) {
        this.numberOfFacilities = numberOfFacilities;
    }

    @Basic
    @Column(name = "number_of_nsae_subjects")
    public Integer getNumberOfNsaeSubjects() {
        return numberOfNsaeSubjects;
    }

    public void setNumberOfNsaeSubjects(Integer numberOfNsaeSubjects) {
        this.numberOfNsaeSubjects = numberOfNsaeSubjects;
    }

    @Basic
    @Column(name = "number_of_sae_subjects")
    public Integer getNumberOfSaeSubjects() {
        return numberOfSaeSubjects;
    }

    public void setNumberOfSaeSubjects(Integer numberOfSaeSubjects) {
        this.numberOfSaeSubjects = numberOfSaeSubjects;
    }

    @Basic
    @Column(name = "registered_in_calendar_year")
    public Integer getRegisteredInCalendarYear() {
        return registeredInCalendarYear;
    }

    public void setRegisteredInCalendarYear(Integer registeredInCalendarYear) {
        this.registeredInCalendarYear = registeredInCalendarYear;
    }

    @Basic
    @Column(name = "nlm_download_date")
    public Date getNlmDownloadDate() {
        return nlmDownloadDate;
    }

    public void setNlmDownloadDate(Date nlmDownloadDate) {
        this.nlmDownloadDate = nlmDownloadDate;
    }

    @Basic
    @Column(name = "actual_duration")
    public Integer getActualDuration() {
        return actualDuration;
    }

    public void setActualDuration(Integer actualDuration) {
        this.actualDuration = actualDuration;
    }

    @Basic
    @Column(name = "were_results_reported")
    public Boolean getWereResultsReported() {
        return wereResultsReported;
    }

    public void setWereResultsReported(Boolean wereResultsReported) {
        this.wereResultsReported = wereResultsReported;
    }

    @Basic
    @Column(name = "months_to_report_results")
    public Integer getMonthsToReportResults() {
        return monthsToReportResults;
    }

    public void setMonthsToReportResults(Integer monthsToReportResults) {
        this.monthsToReportResults = monthsToReportResults;
    }

    @Basic
    @Column(name = "has_us_facility")
    public Boolean getHasUsFacility() {
        return hasUsFacility;
    }

    public void setHasUsFacility(Boolean hasUsFacility) {
        this.hasUsFacility = hasUsFacility;
    }

    @Basic
    @Column(name = "has_single_facility")
    public Boolean getHasSingleFacility() {
        return hasSingleFacility;
    }

    public void setHasSingleFacility(Boolean hasSingleFacility) {
        this.hasSingleFacility = hasSingleFacility;
    }

    @Basic
    @Column(name = "minimum_age_num")
    public Integer getMinimumAgeNum() {
        return minimumAgeNum;
    }

    public void setMinimumAgeNum(Integer minimumAgeNum) {
        this.minimumAgeNum = minimumAgeNum;
    }

    @Basic
    @Column(name = "maximum_age_num")
    public Integer getMaximumAgeNum() {
        return maximumAgeNum;
    }

    public void setMaximumAgeNum(Integer maximumAgeNum) {
        this.maximumAgeNum = maximumAgeNum;
    }

    @Basic
    @Column(name = "minimum_age_unit")
    public String getMinimumAgeUnit() {
        return minimumAgeUnit;
    }

    public void setMinimumAgeUnit(String minimumAgeUnit) {
        this.minimumAgeUnit = minimumAgeUnit;
    }

    @Basic
    @Column(name = "maximum_age_unit")
    public String getMaximumAgeUnit() {
        return maximumAgeUnit;
    }

    public void setMaximumAgeUnit(String maximumAgeUnit) {
        this.maximumAgeUnit = maximumAgeUnit;
    }

    @Basic
    @Column(name = "number_of_primary_outcomes_to_measure")
    public Integer getNumberOfPrimaryOutcomesToMeasure() {
        return numberOfPrimaryOutcomesToMeasure;
    }

    public void setNumberOfPrimaryOutcomesToMeasure(Integer numberOfPrimaryOutcomesToMeasure) {
        this.numberOfPrimaryOutcomesToMeasure = numberOfPrimaryOutcomesToMeasure;
    }

    @Basic
    @Column(name = "number_of_secondary_outcomes_to_measure")
    public Integer getNumberOfSecondaryOutcomesToMeasure() {
        return numberOfSecondaryOutcomesToMeasure;
    }

    public void setNumberOfSecondaryOutcomesToMeasure(Integer numberOfSecondaryOutcomesToMeasure) {
        this.numberOfSecondaryOutcomesToMeasure = numberOfSecondaryOutcomesToMeasure;
    }

    @Basic
    @Column(name = "number_of_other_outcomes_to_measure")
    public Integer getNumberOfOtherOutcomesToMeasure() {
        return numberOfOtherOutcomesToMeasure;
    }

    public void setNumberOfOtherOutcomesToMeasure(Integer numberOfOtherOutcomesToMeasure) {
        this.numberOfOtherOutcomesToMeasure = numberOfOtherOutcomesToMeasure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculatedValues that = (CalculatedValues) o;
        return id == that.id &&
                Objects.equals(numberOfFacilities, that.numberOfFacilities) &&
                Objects.equals(numberOfNsaeSubjects, that.numberOfNsaeSubjects) &&
                Objects.equals(numberOfSaeSubjects, that.numberOfSaeSubjects) &&
                Objects.equals(registeredInCalendarYear, that.registeredInCalendarYear) &&
                Objects.equals(nlmDownloadDate, that.nlmDownloadDate) &&
                Objects.equals(actualDuration, that.actualDuration) &&
                Objects.equals(wereResultsReported, that.wereResultsReported) &&
                Objects.equals(monthsToReportResults, that.monthsToReportResults) &&
                Objects.equals(hasUsFacility, that.hasUsFacility) &&
                Objects.equals(hasSingleFacility, that.hasSingleFacility) &&
                Objects.equals(minimumAgeNum, that.minimumAgeNum) &&
                Objects.equals(maximumAgeNum, that.maximumAgeNum) &&
                Objects.equals(minimumAgeUnit, that.minimumAgeUnit) &&
                Objects.equals(maximumAgeUnit, that.maximumAgeUnit) &&
                Objects.equals(numberOfPrimaryOutcomesToMeasure, that.numberOfPrimaryOutcomesToMeasure) &&
                Objects.equals(numberOfSecondaryOutcomesToMeasure, that.numberOfSecondaryOutcomesToMeasure) &&
                Objects.equals(numberOfOtherOutcomesToMeasure, that.numberOfOtherOutcomesToMeasure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numberOfFacilities, numberOfNsaeSubjects, numberOfSaeSubjects, registeredInCalendarYear, nlmDownloadDate, actualDuration, wereResultsReported, monthsToReportResults, hasUsFacility, hasSingleFacility, minimumAgeNum, maximumAgeNum, minimumAgeUnit, maximumAgeUnit, numberOfPrimaryOutcomesToMeasure, numberOfSecondaryOutcomesToMeasure, numberOfOtherOutcomesToMeasure);
    }

    @ManyToOne
    @JoinColumn(name = "nct_id", referencedColumnName = "nct_id")
    public Studies getStudiesByNctId() {
        return studiesByNctId;
    }

    public void setStudiesByNctId(Studies studiesByNctId) {
        this.studiesByNctId = studiesByNctId;
    }
}
