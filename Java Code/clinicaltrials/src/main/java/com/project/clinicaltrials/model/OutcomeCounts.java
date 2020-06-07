package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "outcome_counts", schema = "ctgov", catalog = "AACT")
public class OutcomeCounts {
    private int id;
    //private String nctId;
    //private Integer outcomeId;
    //private Integer resultGroupId;
    private String ctgovGroupCode;
    private String scope;
    private String units;
    private Integer count;
    private Studies studiesByNctId;
    private Outcomes outcomesByOutcomeId;
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
    @Column(name = "outcome_id")
    public Integer getOutcomeId() {
        return outcomeId;
    }

    public void setOutcomeId(Integer outcomeId) {
        this.outcomeId = outcomeId;
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

    @Basic
    @Column(name = "scope")
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Basic
    @Column(name = "units")
    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    @Basic
    @Column(name = "count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutcomeCounts that = (OutcomeCounts) o;
        return id == that.id &&
                Objects.equals(ctgovGroupCode, that.ctgovGroupCode) &&
                Objects.equals(scope, that.scope) &&
                Objects.equals(units, that.units) &&
                Objects.equals(count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ctgovGroupCode, scope, units, count);
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
    @JoinColumn(name = "outcome_id", referencedColumnName = "id")
    public Outcomes getOutcomesByOutcomeId() {
        return outcomesByOutcomeId;
    }

    public void setOutcomesByOutcomeId(Outcomes outcomesByOutcomeId) {
        this.outcomesByOutcomeId = outcomesByOutcomeId;
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
