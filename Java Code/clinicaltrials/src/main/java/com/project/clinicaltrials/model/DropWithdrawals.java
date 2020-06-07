package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "drop_withdrawals", schema = "ctgov", catalog = "AACT")
public class DropWithdrawals {
    private int id;
    //private String nctId;
    //private Integer resultGroupId;
    private String ctgovGroupCode;
    private String period;
    private String reason;
    private Integer count;
    private Studies studiesByNctId;
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
    @Column(name = "period")
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Basic
    @Column(name = "reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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
        DropWithdrawals that = (DropWithdrawals) o;
        return id == that.id &&
                Objects.equals(ctgovGroupCode, that.ctgovGroupCode) &&
                Objects.equals(period, that.period) &&
                Objects.equals(reason, that.reason) &&
                Objects.equals(count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ctgovGroupCode, period, reason, count);
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
    @JoinColumn(name = "result_group_id", referencedColumnName = "id")
    public ResultGroups getResultGroupsByResultGroupId() {
        return resultGroupsByResultGroupId;
    }

    public void setResultGroupsByResultGroupId(ResultGroups resultGroupsByResultGroupId) {
        this.resultGroupsByResultGroupId = resultGroupsByResultGroupId;
    }
}
