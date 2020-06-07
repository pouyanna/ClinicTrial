package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Sponsors {
    private int id;
    //private String nctId;
    private String agencyClass;
    private String leadOrCollaborator;
    private String name;
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
    @Column(name = "agency_class")
    public String getAgencyClass() {
        return agencyClass;
    }

    public void setAgencyClass(String agencyClass) {
        this.agencyClass = agencyClass;
    }

    @Basic
    @Column(name = "lead_or_collaborator")
    public String getLeadOrCollaborator() {
        return leadOrCollaborator;
    }

    public void setLeadOrCollaborator(String leadOrCollaborator) {
        this.leadOrCollaborator = leadOrCollaborator;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsors sponsors = (Sponsors) o;
        return id == sponsors.id &&
                Objects.equals(agencyClass, sponsors.agencyClass) &&
                Objects.equals(leadOrCollaborator, sponsors.leadOrCollaborator) &&
                Objects.equals(name, sponsors.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, agencyClass, leadOrCollaborator, name);
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
