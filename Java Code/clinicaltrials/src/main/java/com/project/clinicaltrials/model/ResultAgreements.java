package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "result_agreements", schema = "ctgov", catalog = "AACT")
public class ResultAgreements {
    private int id;
    //private String nctId;
    private String piEmployee;
    private String agreement;
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
    @Column(name = "pi_employee")
    public String getPiEmployee() {
        return piEmployee;
    }

    public void setPiEmployee(String piEmployee) {
        this.piEmployee = piEmployee;
    }

    @Basic
    @Column(name = "agreement")
    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultAgreements that = (ResultAgreements) o;
        return id == that.id &&
                Objects.equals(piEmployee, that.piEmployee) &&
                Objects.equals(agreement, that.agreement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, piEmployee, agreement);
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
