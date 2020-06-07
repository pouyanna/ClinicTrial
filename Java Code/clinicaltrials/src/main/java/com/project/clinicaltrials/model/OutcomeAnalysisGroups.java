package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "outcome_analysis_groups", schema = "ctgov", catalog = "AACT")
public class OutcomeAnalysisGroups {
    private int id;
    //private String nctId;
    //private Integer outcomeAnalysisId;
    //private Integer resultGroupId;
    private String ctgovGroupCode;
    private Studies studiesByNctId;
    private OutcomeAnalyses outcomeAnalysesByOutcomeAnalysisId;
    private ResultGroups resultGroupsByResultGroupId;

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

    /*@Basic
    @Column(name = "outcome_analysis_id")
    public Integer getOutcomeAnalysisId() {
        return outcomeAnalysisId;
    }

    public void setOutcomeAnalysisId(Integer outcomeAnalysisId) {
        this.outcomeAnalysisId = outcomeAnalysisId;
    }*/

    /*@Basic
    @Column(name = "result_group_id")
    public Integer getResultGroupId() {
        return resultGroupId;
    }

    public void setResultGroupId(Integer resultGroupId) {
        this.resultGroupId = resultGroupId;
    }*/

    @Basic
    @Column(name = "ctgov_group_code")
    public String getCtgovGroupCode() {
        return ctgovGroupCode;
    }

    public void setCtgovGroupCode(String ctgovGroupCode) {
        this.ctgovGroupCode = ctgovGroupCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutcomeAnalysisGroups that = (OutcomeAnalysisGroups) o;
        return id == that.id &&
                Objects.equals(ctgovGroupCode, that.ctgovGroupCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ctgovGroupCode);
    }

    @ManyToOne
    @JoinColumn(name = "nct_id", referencedColumnName = "nct_id")
    public Studies getStudiesByNctId() {
        return studiesByNctId;
    }

    public void setStudiesByNctId(Studies studiesByNctId) {
        this.studiesByNctId = studiesByNctId;
    }

    @ManyToOne
    @JoinColumn(name = "outcome_analysis_id", referencedColumnName = "id")
    public OutcomeAnalyses getOutcomeAnalysesByOutcomeAnalysisId() {
        return outcomeAnalysesByOutcomeAnalysisId;
    }

    public void setOutcomeAnalysesByOutcomeAnalysisId(OutcomeAnalyses outcomeAnalysesByOutcomeAnalysisId) {
        this.outcomeAnalysesByOutcomeAnalysisId = outcomeAnalysesByOutcomeAnalysisId;
    }

    @ManyToOne
    @JoinColumn(name = "result_group_id", referencedColumnName = "id")
    public ResultGroups getResultGroupsByResultGroupId() {
        return resultGroupsByResultGroupId;
    }

    public void setResultGroupsByResultGroupId(ResultGroups resultGroupsByResultGroupId) {
        this.resultGroupsByResultGroupId = resultGroupsByResultGroupId;
    }
}
