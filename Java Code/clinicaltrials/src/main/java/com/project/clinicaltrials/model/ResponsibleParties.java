package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "responsible_parties", schema = "ctgov", catalog = "AACT")
public class ResponsibleParties {
    private int id;
    //private String nctId;
    private String responsiblePartyType;
    private String name;
    private String title;
    private String organization;
    private String affiliation;
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
    @Column(name = "responsible_party_type")
    public String getResponsiblePartyType() {
        return responsiblePartyType;
    }

    public void setResponsiblePartyType(String responsiblePartyType) {
        this.responsiblePartyType = responsiblePartyType;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "organization")
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Basic
    @Column(name = "affiliation")
    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponsibleParties that = (ResponsibleParties) o;
        return id == that.id &&
                Objects.equals(responsiblePartyType, that.responsiblePartyType) &&
                Objects.equals(name, that.name) &&
                Objects.equals(title, that.title) &&
                Objects.equals(organization, that.organization) &&
                Objects.equals(affiliation, that.affiliation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, responsiblePartyType, name, title, organization, affiliation);
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
