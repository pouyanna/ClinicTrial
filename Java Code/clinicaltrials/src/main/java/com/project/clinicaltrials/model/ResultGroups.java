package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "result_groups", schema = "ctgov", catalog = "AACT")
public class ResultGroups {
    private int id;
    //private String nctId;
    private String ctgovGroupCode;
    private String resultType;
    private String title;
    private String description;
    private Collection<BaselineCounts> baselineCountsById;
    private Collection<BaselineMeasurements> baselineMeasurementsById;
    private Collection<DropWithdrawals> dropWithdrawalsById;
    private Collection<Milestones> milestonesById;
    private Collection<OutcomeAnalysisGroups> outcomeAnalysisGroupsById;
    private Collection<OutcomeCounts> outcomeCountsById;
    private Collection<OutcomeMeasurements> outcomeMeasurementsById;
    private Collection<ReportedEvents> reportedEventsById;
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
    @Column(name = "ctgov_group_code")
    public String getCtgovGroupCode() {
        return ctgovGroupCode;
    }

    public void setCtgovGroupCode(String ctgovGroupCode) {
        this.ctgovGroupCode = ctgovGroupCode;
    }

    @Basic
    @Column(name = "result_type")
    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultGroups that = (ResultGroups) o;
        return id == that.id &&
                Objects.equals(ctgovGroupCode, that.ctgovGroupCode) &&
                Objects.equals(resultType, that.resultType) &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ctgovGroupCode, resultType, title, description);
    }

    @OneToMany(mappedBy = "resultGroupsByResultGroupId")
    public Collection<BaselineCounts> getBaselineCountsById() {
        return baselineCountsById;
    }

    public void setBaselineCountsById(Collection<BaselineCounts> baselineCountsById) {
        this.baselineCountsById = baselineCountsById;
    }

    @OneToMany(mappedBy = "resultGroupsByResultGroupId")
    public Collection<BaselineMeasurements> getBaselineMeasurementsById() {
        return baselineMeasurementsById;
    }

    public void setBaselineMeasurementsById(Collection<BaselineMeasurements> baselineMeasurementsById) {
        this.baselineMeasurementsById = baselineMeasurementsById;
    }

    @OneToMany(mappedBy = "resultGroupsByResultGroupId")
    public Collection<DropWithdrawals> getDropWithdrawalsById() {
        return dropWithdrawalsById;
    }

    public void setDropWithdrawalsById(Collection<DropWithdrawals> dropWithdrawalsById) {
        this.dropWithdrawalsById = dropWithdrawalsById;
    }

    @OneToMany(mappedBy = "resultGroupsByResultGroupId")
    public Collection<Milestones> getMilestonesById() {
        return milestonesById;
    }

    public void setMilestonesById(Collection<Milestones> milestonesById) {
        this.milestonesById = milestonesById;
    }

    @OneToMany(mappedBy = "resultGroupsByResultGroupId")
    public Collection<OutcomeAnalysisGroups> getOutcomeAnalysisGroupsById() {
        return outcomeAnalysisGroupsById;
    }

    public void setOutcomeAnalysisGroupsById(Collection<OutcomeAnalysisGroups> outcomeAnalysisGroupsById) {
        this.outcomeAnalysisGroupsById = outcomeAnalysisGroupsById;
    }

    @OneToMany(mappedBy = "resultGroupsByResultGroupId")
    public Collection<OutcomeCounts> getOutcomeCountsById() {
        return outcomeCountsById;
    }

    public void setOutcomeCountsById(Collection<OutcomeCounts> outcomeCountsById) {
        this.outcomeCountsById = outcomeCountsById;
    }

    @OneToMany(mappedBy = "resultGroupsByResultGroupId")
    public Collection<OutcomeMeasurements> getOutcomeMeasurementsById() {
        return outcomeMeasurementsById;
    }

    public void setOutcomeMeasurementsById(Collection<OutcomeMeasurements> outcomeMeasurementsById) {
        this.outcomeMeasurementsById = outcomeMeasurementsById;
    }

    @OneToMany(mappedBy = "resultGroupsByResultGroupId")
    public Collection<ReportedEvents> getReportedEventsById() {
        return reportedEventsById;
    }

    public void setReportedEventsById(Collection<ReportedEvents> reportedEventsById) {
        this.reportedEventsById = reportedEventsById;
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
