package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Designs {
    private int id;
    //private String nctId;
    private String allocation;
    private String interventionModel;
    private String observationalModel;
    private String primaryPurpose;
    private String timePerspective;
    private String masking;
    private String maskingDescription;
    private String interventionModelDescription;
    private Boolean subjectMasked;
    private Boolean caregiverMasked;
    private Boolean investigatorMasked;
    private Boolean outcomesAssessorMasked;
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
    @Column(name = "allocation")
    public String getAllocation() {
        return allocation;
    }

    public void setAllocation(String allocation) {
        this.allocation = allocation;
    }

    @Basic
    @Column(name = "intervention_model")
    public String getInterventionModel() {
        return interventionModel;
    }

    public void setInterventionModel(String interventionModel) {
        this.interventionModel = interventionModel;
    }

    @Basic
    @Column(name = "observational_model")
    public String getObservationalModel() {
        return observationalModel;
    }

    public void setObservationalModel(String observationalModel) {
        this.observationalModel = observationalModel;
    }

    @Basic
    @Column(name = "primary_purpose")
    public String getPrimaryPurpose() {
        return primaryPurpose;
    }

    public void setPrimaryPurpose(String primaryPurpose) {
        this.primaryPurpose = primaryPurpose;
    }

    @Basic
    @Column(name = "time_perspective")
    public String getTimePerspective() {
        return timePerspective;
    }

    public void setTimePerspective(String timePerspective) {
        this.timePerspective = timePerspective;
    }

    @Basic
    @Column(name = "masking")
    public String getMasking() {
        return masking;
    }

    public void setMasking(String masking) {
        this.masking = masking;
    }

    @Basic
    @Column(name = "masking_description")
    public String getMaskingDescription() {
        return maskingDescription;
    }

    public void setMaskingDescription(String maskingDescription) {
        this.maskingDescription = maskingDescription;
    }

    @Basic
    @Column(name = "intervention_model_description")
    public String getInterventionModelDescription() {
        return interventionModelDescription;
    }

    public void setInterventionModelDescription(String interventionModelDescription) {
        this.interventionModelDescription = interventionModelDescription;
    }

    @Basic
    @Column(name = "subject_masked")
    public Boolean getSubjectMasked() {
        return subjectMasked;
    }

    public void setSubjectMasked(Boolean subjectMasked) {
        this.subjectMasked = subjectMasked;
    }

    @Basic
    @Column(name = "caregiver_masked")
    public Boolean getCaregiverMasked() {
        return caregiverMasked;
    }

    public void setCaregiverMasked(Boolean caregiverMasked) {
        this.caregiverMasked = caregiverMasked;
    }

    @Basic
    @Column(name = "investigator_masked")
    public Boolean getInvestigatorMasked() {
        return investigatorMasked;
    }

    public void setInvestigatorMasked(Boolean investigatorMasked) {
        this.investigatorMasked = investigatorMasked;
    }

    @Basic
    @Column(name = "outcomes_assessor_masked")
    public Boolean getOutcomesAssessorMasked() {
        return outcomesAssessorMasked;
    }

    public void setOutcomesAssessorMasked(Boolean outcomesAssessorMasked) {
        this.outcomesAssessorMasked = outcomesAssessorMasked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Designs designs = (Designs) o;
        return id == designs.id &&
                Objects.equals(allocation, designs.allocation) &&
                Objects.equals(interventionModel, designs.interventionModel) &&
                Objects.equals(observationalModel, designs.observationalModel) &&
                Objects.equals(primaryPurpose, designs.primaryPurpose) &&
                Objects.equals(timePerspective, designs.timePerspective) &&
                Objects.equals(masking, designs.masking) &&
                Objects.equals(maskingDescription, designs.maskingDescription) &&
                Objects.equals(interventionModelDescription, designs.interventionModelDescription) &&
                Objects.equals(subjectMasked, designs.subjectMasked) &&
                Objects.equals(caregiverMasked, designs.caregiverMasked) &&
                Objects.equals(investigatorMasked, designs.investigatorMasked) &&
                Objects.equals(outcomesAssessorMasked, designs.outcomesAssessorMasked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, allocation, interventionModel, observationalModel, primaryPurpose, timePerspective, masking, maskingDescription, interventionModelDescription, subjectMasked, caregiverMasked, investigatorMasked, outcomesAssessorMasked);
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
