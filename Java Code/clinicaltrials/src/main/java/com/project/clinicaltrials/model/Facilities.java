package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Facilities {
    private int id;
    //private String nctId;
    private String status;
    private String name;
    private String city;
    private String state;
    private String zip;
    private String country;
    private Studies studiesByNctId;
    private Collection<FacilityContacts> facilityContactsById;
    private Collection<FacilityInvestigators> facilityInvestigatorsById;

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
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "zip")
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facilities that = (Facilities) o;
        return id == that.id &&
                Objects.equals(status, that.status) &&
                Objects.equals(name, that.name) &&
                Objects.equals(city, that.city) &&
                Objects.equals(state, that.state) &&
                Objects.equals(zip, that.zip) &&
                Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, name, city, state, zip, country);
    }

    @ManyToOne
    @JoinColumn(name = "nct_id", referencedColumnName = "nct_id")
    public Studies getStudiesByNctId() {
        return studiesByNctId;
    }

    public void setStudiesByNctId(Studies studiesByNctId) {
        this.studiesByNctId = studiesByNctId;
    }

    @OneToMany(mappedBy = "facilitiesByFacilityId")
    public Collection<FacilityContacts> getFacilityContactsById() {
        return facilityContactsById;
    }

    public void setFacilityContactsById(Collection<FacilityContacts> facilityContactsById) {
        this.facilityContactsById = facilityContactsById;
    }

    @OneToMany(mappedBy = "facilitiesByFacilityId")
    public Collection<FacilityInvestigators> getFacilityInvestigatorsById() {
        return facilityInvestigatorsById;
    }

    public void setFacilityInvestigatorsById(Collection<FacilityInvestigators> facilityInvestigatorsById) {
        this.facilityInvestigatorsById = facilityInvestigatorsById;
    }
}
