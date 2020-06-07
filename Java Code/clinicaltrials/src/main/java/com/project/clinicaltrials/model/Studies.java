package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.List;
import java.util.Objects;

@Entity
public class Studies {
    private String nctId;
    private String nlmDownloadDateDescription;
    private Date studyFirstSubmittedDate;
    private Date resultsFirstSubmittedDate;
    private Date dispositionFirstSubmittedDate;
    private Date lastUpdateSubmittedDate;
    private Date studyFirstSubmittedQcDate;
    private Date studyFirstPostedDate;
    private String studyFirstPostedDateType;
    private Date resultsFirstSubmittedQcDate;
    private Date resultsFirstPostedDate;
    private String resultsFirstPostedDateType;
    private Date dispositionFirstSubmittedQcDate;
    private Date dispositionFirstPostedDate;
    private String dispositionFirstPostedDateType;
    private Date lastUpdateSubmittedQcDate;
    private Date lastUpdatePostedDate;
    private String lastUpdatePostedDateType;
    private String startMonthYear;
    private String startDateType;
    private Date startDate;
    private String verificationMonthYear;
    private Date verificationDate;
    private String completionMonthYear;
    private String completionDateType;
    private Date completionDate;
    private String primaryCompletionMonthYear;
    private String primaryCompletionDateType;
    private Date primaryCompletionDate;
    private String targetDuration;
    private String studyType;
    private String acronym;
    private String baselinePopulation;
    private String briefTitle;
    private String officialTitle;
    private String overallStatus;
    private String lastKnownStatus;
    private String phase;
    private Integer enrollment;
    private String enrollmentType;
    private String source;
    private String limitationsAndCaveats;
    private Integer numberOfArms;
    private Integer numberOfGroups;
    private String whyStopped;
    private Boolean hasExpandedAccess;
    private Boolean expandedAccessTypeIndividual;
    private Boolean expandedAccessTypeIntermediate;
    private Boolean expandedAccessTypeTreatment;
    private Boolean hasDmc;
    private Boolean isFdaRegulatedDrug;
    private Boolean isFdaRegulatedDevice;
    private Boolean isUnapprovedDevice;
    private Boolean isPpsd;
    private Boolean isUsExport;
    private String biospecRetention;
    private String biospecDescription;
    private String ipdTimeFrame;
    private String ipdAccessCriteria;
    private String ipdUrl;
    private String planToShareIpd;
    private String planToShareIpdDescription;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private List<BaselineCounts> baselineCountsByNctId;
    private List<BaselineMeasurements> baselineMeasurementsByNctId;
    private List<BriefSummaries> briefSummariesByNctId;
    private List<BrowseConditions> browseConditionsByNctId;
    private List<BrowseInterventions> browseInterventionsByNctId;
    private List<CalculatedValues> calculatedValuesByNctId;
    private List<CentralContacts> centralContactsByNctId;
    private List<Conditions> conditionsByNctId;
    private List<Countries> countriesByNctId;
    private List<DesignGroupInterventions> designGroupInterventionsByNctId;
    private List<DesignGroups> designGroupsByNctId;
    private List<DesignOutcomes> designOutcomesByNctId;
    private List<Designs> designsByNctId;
    private List<DetailedDescriptions> detailedDescriptionsByNctId;
    private List<Documents> documentsByNctId;
    private List<DropWithdrawals> dropWithdrawalsByNctId;
    private List<Eligibilities> eligibilitiesByNctId;
    private List<Facilities> facilitiesByNctId;
    private List<FacilityContacts> facilityContactsByNctId;
    private List<FacilityInvestigators> facilityInvestigatorsByNctId;
    private List<IdInformation> idInformationsByNctId;
    private List<InterventionOtherNames> interventionOtherNamesByNctId;
    private List<Interventions> interventionsByNctId;
    private List<IpdInformationTypes> ipdInformationTypesByNctId;
    private List<Keywords> keywordsByNctId;
    private List<Links> linksByNctId;
    private List<Milestones> milestonesByNctId;
    private List<OutcomeAnalyses> outcomeAnalysesByNctId;
    private List<OutcomeAnalysisGroups> outcomeAnalysisGroupsByNctId;
    private List<OutcomeCounts> outcomeCountsByNctId;
    private List<OutcomeMeasurements> outcomeMeasurementsByNctId;
    private List<Outcomes> outcomesByNctId;
    private List<OverallOfficials> overallOfficialsByNctId;
    private List<ParticipantFlows> participantFlowsByNctId;
    private List<PendingResults> pendingResultsByNctId;
    private List<ProvidedDocuments> providedDocumentsByNctId;
    private List<ReportedEvents> reportedEventsByNctId;
    private List<ResponsibleParties> responsiblePartiesByNctId;
    private List<ResultAgreements> resultAgreementsByNctId;
    private List<ResultContacts> resultContactsByNctId;
    private List<ResultGroups> resultGroupsByNctId;
    private List<Sponsors> sponsorsByNctId;
    private List<StudyReferences> studyReferencesByNctId;

    @Id
    @Column(name = "nct_id")
    public String getNctId() {
        return nctId;
    }

    public void setNctId(String nctId) {
        this.nctId = nctId;
    }

    @Basic
    @Column(name = "nlm_download_date_description")
    public String getNlmDownloadDateDescription() {
        return nlmDownloadDateDescription;
    }

    public void setNlmDownloadDateDescription(String nlmDownloadDateDescription) {
        this.nlmDownloadDateDescription = nlmDownloadDateDescription;
    }

    @Basic
    @Column(name = "study_first_submitted_date")
    public Date getStudyFirstSubmittedDate() {
        return studyFirstSubmittedDate;
    }

    public void setStudyFirstSubmittedDate(Date studyFirstSubmittedDate) {
        this.studyFirstSubmittedDate = studyFirstSubmittedDate;
    }

    @Basic
    @Column(name = "results_first_submitted_date")
    public Date getResultsFirstSubmittedDate() {
        return resultsFirstSubmittedDate;
    }

    public void setResultsFirstSubmittedDate(Date resultsFirstSubmittedDate) {
        this.resultsFirstSubmittedDate = resultsFirstSubmittedDate;
    }

    @Basic
    @Column(name = "disposition_first_submitted_date")
    public Date getDispositionFirstSubmittedDate() {
        return dispositionFirstSubmittedDate;
    }

    public void setDispositionFirstSubmittedDate(Date dispositionFirstSubmittedDate) {
        this.dispositionFirstSubmittedDate = dispositionFirstSubmittedDate;
    }

    @Basic
    @Column(name = "last_update_submitted_date")
    public Date getLastUpdateSubmittedDate() {
        return lastUpdateSubmittedDate;
    }

    public void setLastUpdateSubmittedDate(Date lastUpdateSubmittedDate) {
        this.lastUpdateSubmittedDate = lastUpdateSubmittedDate;
    }

    @Basic
    @Column(name = "study_first_submitted_qc_date")
    public Date getStudyFirstSubmittedQcDate() {
        return studyFirstSubmittedQcDate;
    }

    public void setStudyFirstSubmittedQcDate(Date studyFirstSubmittedQcDate) {
        this.studyFirstSubmittedQcDate = studyFirstSubmittedQcDate;
    }

    @Basic
    @Column(name = "study_first_posted_date")
    public Date getStudyFirstPostedDate() {
        return studyFirstPostedDate;
    }

    public void setStudyFirstPostedDate(Date studyFirstPostedDate) {
        this.studyFirstPostedDate = studyFirstPostedDate;
    }

    @Basic
    @Column(name = "study_first_posted_date_type")
    public String getStudyFirstPostedDateType() {
        return studyFirstPostedDateType;
    }

    public void setStudyFirstPostedDateType(String studyFirstPostedDateType) {
        this.studyFirstPostedDateType = studyFirstPostedDateType;
    }

    @Basic
    @Column(name = "results_first_submitted_qc_date")
    public Date getResultsFirstSubmittedQcDate() {
        return resultsFirstSubmittedQcDate;
    }

    public void setResultsFirstSubmittedQcDate(Date resultsFirstSubmittedQcDate) {
        this.resultsFirstSubmittedQcDate = resultsFirstSubmittedQcDate;
    }

    @Basic
    @Column(name = "results_first_posted_date")
    public Date getResultsFirstPostedDate() {
        return resultsFirstPostedDate;
    }

    public void setResultsFirstPostedDate(Date resultsFirstPostedDate) {
        this.resultsFirstPostedDate = resultsFirstPostedDate;
    }

    @Basic
    @Column(name = "results_first_posted_date_type")
    public String getResultsFirstPostedDateType() {
        return resultsFirstPostedDateType;
    }

    public void setResultsFirstPostedDateType(String resultsFirstPostedDateType) {
        this.resultsFirstPostedDateType = resultsFirstPostedDateType;
    }

    @Basic
    @Column(name = "disposition_first_submitted_qc_date")
    public Date getDispositionFirstSubmittedQcDate() {
        return dispositionFirstSubmittedQcDate;
    }

    public void setDispositionFirstSubmittedQcDate(Date dispositionFirstSubmittedQcDate) {
        this.dispositionFirstSubmittedQcDate = dispositionFirstSubmittedQcDate;
    }

    @Basic
    @Column(name = "disposition_first_posted_date")
    public Date getDispositionFirstPostedDate() {
        return dispositionFirstPostedDate;
    }

    public void setDispositionFirstPostedDate(Date dispositionFirstPostedDate) {
        this.dispositionFirstPostedDate = dispositionFirstPostedDate;
    }

    @Basic
    @Column(name = "disposition_first_posted_date_type")
    public String getDispositionFirstPostedDateType() {
        return dispositionFirstPostedDateType;
    }

    public void setDispositionFirstPostedDateType(String dispositionFirstPostedDateType) {
        this.dispositionFirstPostedDateType = dispositionFirstPostedDateType;
    }

    @Basic
    @Column(name = "last_update_submitted_qc_date")
    public Date getLastUpdateSubmittedQcDate() {
        return lastUpdateSubmittedQcDate;
    }

    public void setLastUpdateSubmittedQcDate(Date lastUpdateSubmittedQcDate) {
        this.lastUpdateSubmittedQcDate = lastUpdateSubmittedQcDate;
    }

    @Basic
    @Column(name = "last_update_posted_date")
    public Date getLastUpdatePostedDate() {
        return lastUpdatePostedDate;
    }

    public void setLastUpdatePostedDate(Date lastUpdatePostedDate) {
        this.lastUpdatePostedDate = lastUpdatePostedDate;
    }

    @Basic
    @Column(name = "last_update_posted_date_type")
    public String getLastUpdatePostedDateType() {
        return lastUpdatePostedDateType;
    }

    public void setLastUpdatePostedDateType(String lastUpdatePostedDateType) {
        this.lastUpdatePostedDateType = lastUpdatePostedDateType;
    }

    @Basic
    @Column(name = "start_month_year")
    public String getStartMonthYear() {
        return startMonthYear;
    }

    public void setStartMonthYear(String startMonthYear) {
        this.startMonthYear = startMonthYear;
    }

    @Basic
    @Column(name = "start_date_type")
    public String getStartDateType() {
        return startDateType;
    }

    public void setStartDateType(String startDateType) {
        this.startDateType = startDateType;
    }

    @Basic
    @Column(name = "start_date")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "verification_month_year")
    public String getVerificationMonthYear() {
        return verificationMonthYear;
    }

    public void setVerificationMonthYear(String verificationMonthYear) {
        this.verificationMonthYear = verificationMonthYear;
    }

    @Basic
    @Column(name = "verification_date")
    public Date getVerificationDate() {
        return verificationDate;
    }

    public void setVerificationDate(Date verificationDate) {
        this.verificationDate = verificationDate;
    }

    @Basic
    @Column(name = "completion_month_year")
    public String getCompletionMonthYear() {
        return completionMonthYear;
    }

    public void setCompletionMonthYear(String completionMonthYear) {
        this.completionMonthYear = completionMonthYear;
    }

    @Basic
    @Column(name = "completion_date_type")
    public String getCompletionDateType() {
        return completionDateType;
    }

    public void setCompletionDateType(String completionDateType) {
        this.completionDateType = completionDateType;
    }

    @Basic
    @Column(name = "completion_date")
    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    @Basic
    @Column(name = "primary_completion_month_year")
    public String getPrimaryCompletionMonthYear() {
        return primaryCompletionMonthYear;
    }

    public void setPrimaryCompletionMonthYear(String primaryCompletionMonthYear) {
        this.primaryCompletionMonthYear = primaryCompletionMonthYear;
    }

    @Basic
    @Column(name = "primary_completion_date_type")
    public String getPrimaryCompletionDateType() {
        return primaryCompletionDateType;
    }

    public void setPrimaryCompletionDateType(String primaryCompletionDateType) {
        this.primaryCompletionDateType = primaryCompletionDateType;
    }

    @Basic
    @Column(name = "primary_completion_date")
    public Date getPrimaryCompletionDate() {
        return primaryCompletionDate;
    }

    public void setPrimaryCompletionDate(Date primaryCompletionDate) {
        this.primaryCompletionDate = primaryCompletionDate;
    }

    @Basic
    @Column(name = "target_duration")
    public String getTargetDuration() {
        return targetDuration;
    }

    public void setTargetDuration(String targetDuration) {
        this.targetDuration = targetDuration;
    }

    @Basic
    @Column(name = "study_type")
    public String getStudyType() {
        return studyType;
    }

    public void setStudyType(String studyType) {
        this.studyType = studyType;
    }

    @Basic
    @Column(name = "acronym")
    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    @Basic
    @Column(name = "baseline_population")
    public String getBaselinePopulation() {
        return baselinePopulation;
    }

    public void setBaselinePopulation(String baselinePopulation) {
        this.baselinePopulation = baselinePopulation;
    }

    @Basic
    @Column(name = "brief_title")
    public String getBriefTitle() {
        return briefTitle;
    }

    public void setBriefTitle(String briefTitle) {
        this.briefTitle = briefTitle;
    }

    @Basic
    @Column(name = "official_title")
    public String getOfficialTitle() {
        return officialTitle;
    }

    public void setOfficialTitle(String officialTitle) {
        this.officialTitle = officialTitle;
    }

    @Basic
    @Column(name = "overall_status")
    public String getOverallStatus() {
        return overallStatus;
    }

    public void setOverallStatus(String overallStatus) {
        this.overallStatus = overallStatus;
    }

    @Basic
    @Column(name = "last_known_status")
    public String getLastKnownStatus() {
        return lastKnownStatus;
    }

    public void setLastKnownStatus(String lastKnownStatus) {
        this.lastKnownStatus = lastKnownStatus;
    }

    @Basic
    @Column(name = "phase")
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    @Basic
    @Column(name = "enrollment")
    public Integer getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Integer enrollment) {
        this.enrollment = enrollment;
    }

    @Basic
    @Column(name = "enrollment_type")
    public String getEnrollmentType() {
        return enrollmentType;
    }

    public void setEnrollmentType(String enrollmentType) {
        this.enrollmentType = enrollmentType;
    }

    @Basic
    @Column(name = "source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Basic
    @Column(name = "limitations_and_caveats")
    public String getLimitationsAndCaveats() {
        return limitationsAndCaveats;
    }

    public void setLimitationsAndCaveats(String limitationsAndCaveats) {
        this.limitationsAndCaveats = limitationsAndCaveats;
    }

    @Basic
    @Column(name = "number_of_arms")
    public Integer getNumberOfArms() {
        return numberOfArms;
    }

    public void setNumberOfArms(Integer numberOfArms) {
        this.numberOfArms = numberOfArms;
    }

    @Basic
    @Column(name = "number_of_groups")
    public Integer getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(Integer numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    @Basic
    @Column(name = "why_stopped")
    public String getWhyStopped() {
        return whyStopped;
    }

    public void setWhyStopped(String whyStopped) {
        this.whyStopped = whyStopped;
    }

    @Basic
    @Column(name = "has_expanded_access")
    public Boolean getHasExpandedAccess() {
        return hasExpandedAccess;
    }

    public void setHasExpandedAccess(Boolean hasExpandedAccess) {
        this.hasExpandedAccess = hasExpandedAccess;
    }

    @Basic
    @Column(name = "expanded_access_type_individual")
    public Boolean getExpandedAccessTypeIndividual() {
        return expandedAccessTypeIndividual;
    }

    public void setExpandedAccessTypeIndividual(Boolean expandedAccessTypeIndividual) {
        this.expandedAccessTypeIndividual = expandedAccessTypeIndividual;
    }

    @Basic
    @Column(name = "expanded_access_type_intermediate")
    public Boolean getExpandedAccessTypeIntermediate() {
        return expandedAccessTypeIntermediate;
    }

    public void setExpandedAccessTypeIntermediate(Boolean expandedAccessTypeIntermediate) {
        this.expandedAccessTypeIntermediate = expandedAccessTypeIntermediate;
    }

    @Basic
    @Column(name = "expanded_access_type_treatment")
    public Boolean getExpandedAccessTypeTreatment() {
        return expandedAccessTypeTreatment;
    }

    public void setExpandedAccessTypeTreatment(Boolean expandedAccessTypeTreatment) {
        this.expandedAccessTypeTreatment = expandedAccessTypeTreatment;
    }

    @Basic
    @Column(name = "has_dmc")
    public Boolean getHasDmc() {
        return hasDmc;
    }

    public void setHasDmc(Boolean hasDmc) {
        this.hasDmc = hasDmc;
    }

    @Basic
    @Column(name = "is_fda_regulated_drug")
    public Boolean getFdaRegulatedDrug() {
        return isFdaRegulatedDrug;
    }

    public void setFdaRegulatedDrug(Boolean fdaRegulatedDrug) {
        isFdaRegulatedDrug = fdaRegulatedDrug;
    }

    @Basic
    @Column(name = "is_fda_regulated_device")
    public Boolean getFdaRegulatedDevice() {
        return isFdaRegulatedDevice;
    }

    public void setFdaRegulatedDevice(Boolean fdaRegulatedDevice) {
        isFdaRegulatedDevice = fdaRegulatedDevice;
    }

    @Basic
    @Column(name = "is_unapproved_device")
    public Boolean getUnapprovedDevice() {
        return isUnapprovedDevice;
    }

    public void setUnapprovedDevice(Boolean unapprovedDevice) {
        isUnapprovedDevice = unapprovedDevice;
    }

    @Basic
    @Column(name = "is_ppsd")
    public Boolean getPpsd() {
        return isPpsd;
    }

    public void setPpsd(Boolean ppsd) {
        isPpsd = ppsd;
    }

    @Basic
    @Column(name = "is_us_export")
    public Boolean getUsExport() {
        return isUsExport;
    }

    public void setUsExport(Boolean usExport) {
        isUsExport = usExport;
    }

    @Basic
    @Column(name = "biospec_retention")
    public String getBiospecRetention() {
        return biospecRetention;
    }

    public void setBiospecRetention(String biospecRetention) {
        this.biospecRetention = biospecRetention;
    }

    @Basic
    @Column(name = "biospec_description")
    public String getBiospecDescription() {
        return biospecDescription;
    }

    public void setBiospecDescription(String biospecDescription) {
        this.biospecDescription = biospecDescription;
    }

    @Basic
    @Column(name = "ipd_time_frame")
    public String getIpdTimeFrame() {
        return ipdTimeFrame;
    }

    public void setIpdTimeFrame(String ipdTimeFrame) {
        this.ipdTimeFrame = ipdTimeFrame;
    }

    @Basic
    @Column(name = "ipd_access_criteria")
    public String getIpdAccessCriteria() {
        return ipdAccessCriteria;
    }

    public void setIpdAccessCriteria(String ipdAccessCriteria) {
        this.ipdAccessCriteria = ipdAccessCriteria;
    }

    @Basic
    @Column(name = "ipd_url")
    public String getIpdUrl() {
        return ipdUrl;
    }

    public void setIpdUrl(String ipdUrl) {
        this.ipdUrl = ipdUrl;
    }

    @Basic
    @Column(name = "plan_to_share_ipd")
    public String getPlanToShareIpd() {
        return planToShareIpd;
    }

    public void setPlanToShareIpd(String planToShareIpd) {
        this.planToShareIpd = planToShareIpd;
    }

    @Basic
    @Column(name = "plan_to_share_ipd_description")
    public String getPlanToShareIpdDescription() {
        return planToShareIpdDescription;
    }

    public void setPlanToShareIpdDescription(String planToShareIpdDescription) {
        this.planToShareIpdDescription = planToShareIpdDescription;
    }

    @Basic
    @Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at")
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studies studies = (Studies) o;
        return Objects.equals(nctId, studies.nctId) &&
                Objects.equals(nlmDownloadDateDescription, studies.nlmDownloadDateDescription) &&
                Objects.equals(studyFirstSubmittedDate, studies.studyFirstSubmittedDate) &&
                Objects.equals(resultsFirstSubmittedDate, studies.resultsFirstSubmittedDate) &&
                Objects.equals(dispositionFirstSubmittedDate, studies.dispositionFirstSubmittedDate) &&
                Objects.equals(lastUpdateSubmittedDate, studies.lastUpdateSubmittedDate) &&
                Objects.equals(studyFirstSubmittedQcDate, studies.studyFirstSubmittedQcDate) &&
                Objects.equals(studyFirstPostedDate, studies.studyFirstPostedDate) &&
                Objects.equals(studyFirstPostedDateType, studies.studyFirstPostedDateType) &&
                Objects.equals(resultsFirstSubmittedQcDate, studies.resultsFirstSubmittedQcDate) &&
                Objects.equals(resultsFirstPostedDate, studies.resultsFirstPostedDate) &&
                Objects.equals(resultsFirstPostedDateType, studies.resultsFirstPostedDateType) &&
                Objects.equals(dispositionFirstSubmittedQcDate, studies.dispositionFirstSubmittedQcDate) &&
                Objects.equals(dispositionFirstPostedDate, studies.dispositionFirstPostedDate) &&
                Objects.equals(dispositionFirstPostedDateType, studies.dispositionFirstPostedDateType) &&
                Objects.equals(lastUpdateSubmittedQcDate, studies.lastUpdateSubmittedQcDate) &&
                Objects.equals(lastUpdatePostedDate, studies.lastUpdatePostedDate) &&
                Objects.equals(lastUpdatePostedDateType, studies.lastUpdatePostedDateType) &&
                Objects.equals(startMonthYear, studies.startMonthYear) &&
                Objects.equals(startDateType, studies.startDateType) &&
                Objects.equals(startDate, studies.startDate) &&
                Objects.equals(verificationMonthYear, studies.verificationMonthYear) &&
                Objects.equals(verificationDate, studies.verificationDate) &&
                Objects.equals(completionMonthYear, studies.completionMonthYear) &&
                Objects.equals(completionDateType, studies.completionDateType) &&
                Objects.equals(completionDate, studies.completionDate) &&
                Objects.equals(primaryCompletionMonthYear, studies.primaryCompletionMonthYear) &&
                Objects.equals(primaryCompletionDateType, studies.primaryCompletionDateType) &&
                Objects.equals(primaryCompletionDate, studies.primaryCompletionDate) &&
                Objects.equals(targetDuration, studies.targetDuration) &&
                Objects.equals(studyType, studies.studyType) &&
                Objects.equals(acronym, studies.acronym) &&
                Objects.equals(baselinePopulation, studies.baselinePopulation) &&
                Objects.equals(briefTitle, studies.briefTitle) &&
                Objects.equals(officialTitle, studies.officialTitle) &&
                Objects.equals(overallStatus, studies.overallStatus) &&
                Objects.equals(lastKnownStatus, studies.lastKnownStatus) &&
                Objects.equals(phase, studies.phase) &&
                Objects.equals(enrollment, studies.enrollment) &&
                Objects.equals(enrollmentType, studies.enrollmentType) &&
                Objects.equals(source, studies.source) &&
                Objects.equals(limitationsAndCaveats, studies.limitationsAndCaveats) &&
                Objects.equals(numberOfArms, studies.numberOfArms) &&
                Objects.equals(numberOfGroups, studies.numberOfGroups) &&
                Objects.equals(whyStopped, studies.whyStopped) &&
                Objects.equals(hasExpandedAccess, studies.hasExpandedAccess) &&
                Objects.equals(expandedAccessTypeIndividual, studies.expandedAccessTypeIndividual) &&
                Objects.equals(expandedAccessTypeIntermediate, studies.expandedAccessTypeIntermediate) &&
                Objects.equals(expandedAccessTypeTreatment, studies.expandedAccessTypeTreatment) &&
                Objects.equals(hasDmc, studies.hasDmc) &&
                Objects.equals(isFdaRegulatedDrug, studies.isFdaRegulatedDrug) &&
                Objects.equals(isFdaRegulatedDevice, studies.isFdaRegulatedDevice) &&
                Objects.equals(isUnapprovedDevice, studies.isUnapprovedDevice) &&
                Objects.equals(isPpsd, studies.isPpsd) &&
                Objects.equals(isUsExport, studies.isUsExport) &&
                Objects.equals(biospecRetention, studies.biospecRetention) &&
                Objects.equals(biospecDescription, studies.biospecDescription) &&
                Objects.equals(ipdTimeFrame, studies.ipdTimeFrame) &&
                Objects.equals(ipdAccessCriteria, studies.ipdAccessCriteria) &&
                Objects.equals(ipdUrl, studies.ipdUrl) &&
                Objects.equals(planToShareIpd, studies.planToShareIpd) &&
                Objects.equals(planToShareIpdDescription, studies.planToShareIpdDescription) &&
                Objects.equals(createdAt, studies.createdAt) &&
                Objects.equals(updatedAt, studies.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nctId, nlmDownloadDateDescription, studyFirstSubmittedDate, resultsFirstSubmittedDate, dispositionFirstSubmittedDate, lastUpdateSubmittedDate, studyFirstSubmittedQcDate, studyFirstPostedDate, studyFirstPostedDateType, resultsFirstSubmittedQcDate, resultsFirstPostedDate, resultsFirstPostedDateType, dispositionFirstSubmittedQcDate, dispositionFirstPostedDate, dispositionFirstPostedDateType, lastUpdateSubmittedQcDate, lastUpdatePostedDate, lastUpdatePostedDateType, startMonthYear, startDateType, startDate, verificationMonthYear, verificationDate, completionMonthYear, completionDateType, completionDate, primaryCompletionMonthYear, primaryCompletionDateType, primaryCompletionDate, targetDuration, studyType, acronym, baselinePopulation, briefTitle, officialTitle, overallStatus, lastKnownStatus, phase, enrollment, enrollmentType, source, limitationsAndCaveats, numberOfArms, numberOfGroups, whyStopped, hasExpandedAccess, expandedAccessTypeIndividual, expandedAccessTypeIntermediate, expandedAccessTypeTreatment, hasDmc, isFdaRegulatedDrug, isFdaRegulatedDevice, isUnapprovedDevice, isPpsd, isUsExport, biospecRetention, biospecDescription, ipdTimeFrame, ipdAccessCriteria, ipdUrl, planToShareIpd, planToShareIpdDescription, createdAt, updatedAt);
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<BaselineCounts> getBaselineCountsByNctId() {
        return baselineCountsByNctId;
    }

    public void setBaselineCountsByNctId(List<BaselineCounts> baselineCountsByNctId) {
        this.baselineCountsByNctId = baselineCountsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<BaselineMeasurements> getBaselineMeasurementsByNctId() {
        return baselineMeasurementsByNctId;
    }

    public void setBaselineMeasurementsByNctId(List<BaselineMeasurements> baselineMeasurementsByNctId) {
        this.baselineMeasurementsByNctId = baselineMeasurementsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<BriefSummaries> getBriefSummariesByNctId() {
        return briefSummariesByNctId;
    }

    public void setBriefSummariesByNctId(List<BriefSummaries> briefSummariesByNctId) {
        this.briefSummariesByNctId = briefSummariesByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<BrowseConditions> getBrowseConditionsByNctId() {
        return browseConditionsByNctId;
    }

    public void setBrowseConditionsByNctId(List<BrowseConditions> browseConditionsByNctId) {
        this.browseConditionsByNctId = browseConditionsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<BrowseInterventions> getBrowseInterventionsByNctId() {
        return browseInterventionsByNctId;
    }

    public void setBrowseInterventionsByNctId(List<BrowseInterventions> browseInterventionsByNctId) {
        this.browseInterventionsByNctId = browseInterventionsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<CalculatedValues> getCalculatedValuesByNctId() {
        return calculatedValuesByNctId;
    }

    public void setCalculatedValuesByNctId(List<CalculatedValues> calculatedValuesByNctId) {
        this.calculatedValuesByNctId = calculatedValuesByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<CentralContacts> getCentralContactsByNctId() {
        return centralContactsByNctId;
    }

    public void setCentralContactsByNctId(List<CentralContacts> centralContactsByNctId) {
        this.centralContactsByNctId = centralContactsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<Conditions> getConditionsByNctId() {
        return conditionsByNctId;
    }

    public void setConditionsByNctId(List<Conditions> conditionsByNctId) {
        this.conditionsByNctId = conditionsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<Countries> getCountriesByNctId() {
        return countriesByNctId;
    }

    public void setCountriesByNctId(List<Countries> countriesByNctId) {
        this.countriesByNctId = countriesByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<DesignGroupInterventions> getDesignGroupInterventionsByNctId() {
        return designGroupInterventionsByNctId;
    }

    public void setDesignGroupInterventionsByNctId(List<DesignGroupInterventions> designGroupInterventionsByNctId) {
        this.designGroupInterventionsByNctId = designGroupInterventionsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<DesignGroups> getDesignGroupsByNctId() {
        return designGroupsByNctId;
    }

    public void setDesignGroupsByNctId(List<DesignGroups> designGroupsByNctId) {
        this.designGroupsByNctId = designGroupsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<DesignOutcomes> getDesignOutcomesByNctId() {
        return designOutcomesByNctId;
    }

    public void setDesignOutcomesByNctId(List<DesignOutcomes> designOutcomesByNctId) {
        this.designOutcomesByNctId = designOutcomesByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<Designs> getDesignsByNctId() {
        return designsByNctId;
    }

    public void setDesignsByNctId(List<Designs> designsByNctId) {
        this.designsByNctId = designsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<DetailedDescriptions> getDetailedDescriptionsByNctId() {
        return detailedDescriptionsByNctId;
    }

    public void setDetailedDescriptionsByNctId(List<DetailedDescriptions> detailedDescriptionsByNctId) {
        this.detailedDescriptionsByNctId = detailedDescriptionsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<Documents> getDocumentsByNctId() {
        return documentsByNctId;
    }

    public void setDocumentsByNctId(List<Documents> documentsByNctId) {
        this.documentsByNctId = documentsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<DropWithdrawals> getDropWithdrawalsByNctId() {
        return dropWithdrawalsByNctId;
    }

    public void setDropWithdrawalsByNctId(List<DropWithdrawals> dropWithdrawalsByNctId) {
        this.dropWithdrawalsByNctId = dropWithdrawalsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<Eligibilities> getEligibilitiesByNctId() {
        return eligibilitiesByNctId;
    }

    public void setEligibilitiesByNctId(List<Eligibilities> eligibilitiesByNctId) {
        this.eligibilitiesByNctId = eligibilitiesByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<Facilities> getFacilitiesByNctId() {
        return facilitiesByNctId;
    }

    public void setFacilitiesByNctId(List<Facilities> facilitiesByNctId) {
        this.facilitiesByNctId = facilitiesByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<FacilityContacts> getFacilityContactsByNctId() {
        return facilityContactsByNctId;
    }

    public void setFacilityContactsByNctId(List<FacilityContacts> facilityContactsByNctId) {
        this.facilityContactsByNctId = facilityContactsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<FacilityInvestigators> getFacilityInvestigatorsByNctId() {
        return facilityInvestigatorsByNctId;
    }

    public void setFacilityInvestigatorsByNctId(List<FacilityInvestigators> facilityInvestigatorsByNctId) {
        this.facilityInvestigatorsByNctId = facilityInvestigatorsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<IdInformation> getIdInformationsByNctId() {
        return idInformationsByNctId;
    }

    public void setIdInformationsByNctId(List<IdInformation> idInformationsByNctId) {
        this.idInformationsByNctId = idInformationsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<InterventionOtherNames> getInterventionOtherNamesByNctId() {
        return interventionOtherNamesByNctId;
    }

    public void setInterventionOtherNamesByNctId(List<InterventionOtherNames> interventionOtherNamesByNctId) {
        this.interventionOtherNamesByNctId = interventionOtherNamesByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<Interventions> getInterventionsByNctId() {
        return interventionsByNctId;
    }

    public void setInterventionsByNctId(List<Interventions> interventionsByNctId) {
        this.interventionsByNctId = interventionsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<IpdInformationTypes> getIpdInformationTypesByNctId() {
        return ipdInformationTypesByNctId;
    }

    public void setIpdInformationTypesByNctId(List<IpdInformationTypes> ipdInformationTypesByNctId) {
        this.ipdInformationTypesByNctId = ipdInformationTypesByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<Keywords> getKeywordsByNctId() {
        return keywordsByNctId;
    }

    public void setKeywordsByNctId(List<Keywords> keywordsByNctId) {
        this.keywordsByNctId = keywordsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<Links> getLinksByNctId() {
        return linksByNctId;
    }

    public void setLinksByNctId(List<Links> linksByNctId) {
        this.linksByNctId = linksByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<Milestones> getMilestonesByNctId() {
        return milestonesByNctId;
    }

    public void setMilestonesByNctId(List<Milestones> milestonesByNctId) {
        this.milestonesByNctId = milestonesByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<OutcomeAnalyses> getOutcomeAnalysesByNctId() {
        return outcomeAnalysesByNctId;
    }

    public void setOutcomeAnalysesByNctId(List<OutcomeAnalyses> outcomeAnalysesByNctId) {
        this.outcomeAnalysesByNctId = outcomeAnalysesByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<OutcomeAnalysisGroups> getOutcomeAnalysisGroupsByNctId() {
        return outcomeAnalysisGroupsByNctId;
    }

    public void setOutcomeAnalysisGroupsByNctId(List<OutcomeAnalysisGroups> outcomeAnalysisGroupsByNctId) {
        this.outcomeAnalysisGroupsByNctId = outcomeAnalysisGroupsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<OutcomeCounts> getOutcomeCountsByNctId() {
        return outcomeCountsByNctId;
    }

    public void setOutcomeCountsByNctId(List<OutcomeCounts> outcomeCountsByNctId) {
        this.outcomeCountsByNctId = outcomeCountsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<OutcomeMeasurements> getOutcomeMeasurementsByNctId() {
        return outcomeMeasurementsByNctId;
    }

    public void setOutcomeMeasurementsByNctId(List<OutcomeMeasurements> outcomeMeasurementsByNctId) {
        this.outcomeMeasurementsByNctId = outcomeMeasurementsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<Outcomes> getOutcomesByNctId() {
        return outcomesByNctId;
    }

    public void setOutcomesByNctId(List<Outcomes> outcomesByNctId) {
        this.outcomesByNctId = outcomesByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<OverallOfficials> getOverallOfficialsByNctId() {
        return overallOfficialsByNctId;
    }

    public void setOverallOfficialsByNctId(List<OverallOfficials> overallOfficialsByNctId) {
        this.overallOfficialsByNctId = overallOfficialsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<ParticipantFlows> getParticipantFlowsByNctId() {
        return participantFlowsByNctId;
    }

    public void setParticipantFlowsByNctId(List<ParticipantFlows> participantFlowsByNctId) {
        this.participantFlowsByNctId = participantFlowsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<PendingResults> getPendingResultsByNctId() {
        return pendingResultsByNctId;
    }

    public void setPendingResultsByNctId(List<PendingResults> pendingResultsByNctId) {
        this.pendingResultsByNctId = pendingResultsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<ProvidedDocuments> getProvidedDocumentsByNctId() {
        return providedDocumentsByNctId;
    }

    public void setProvidedDocumentsByNctId(List<ProvidedDocuments> providedDocumentsByNctId) {
        this.providedDocumentsByNctId = providedDocumentsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<ReportedEvents> getReportedEventsByNctId() {
        return reportedEventsByNctId;
    }

    public void setReportedEventsByNctId(List<ReportedEvents> reportedEventsByNctId) {
        this.reportedEventsByNctId = reportedEventsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<ResponsibleParties> getResponsiblePartiesByNctId() {
        return responsiblePartiesByNctId;
    }

    public void setResponsiblePartiesByNctId(List<ResponsibleParties> responsiblePartiesByNctId) {
        this.responsiblePartiesByNctId = responsiblePartiesByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<ResultAgreements> getResultAgreementsByNctId() {
        return resultAgreementsByNctId;
    }

    public void setResultAgreementsByNctId(List<ResultAgreements> resultAgreementsByNctId) {
        this.resultAgreementsByNctId = resultAgreementsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<ResultContacts> getResultContactsByNctId() {
        return resultContactsByNctId;
    }

    public void setResultContactsByNctId(List<ResultContacts> resultContactsByNctId) {
        this.resultContactsByNctId = resultContactsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<ResultGroups> getResultGroupsByNctId() {
        return resultGroupsByNctId;
    }

    public void setResultGroupsByNctId(List<ResultGroups> resultGroupsByNctId) {
        this.resultGroupsByNctId = resultGroupsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<Sponsors> getSponsorsByNctId() {
        return sponsorsByNctId;
    }

    public void setSponsorsByNctId(List<Sponsors> sponsorsByNctId) {
        this.sponsorsByNctId = sponsorsByNctId;
    }

    @OneToMany(mappedBy = "studiesByNctId")
    public List<StudyReferences> getStudyReferencesByNctId() {
        return studyReferencesByNctId;
    }

    public void setStudyReferencesByNctId(List<StudyReferences> studyReferencesByNctId) {
        this.studyReferencesByNctId = studyReferencesByNctId;
    }


}
