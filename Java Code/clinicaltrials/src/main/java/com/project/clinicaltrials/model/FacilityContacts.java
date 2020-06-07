package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "facility_contacts", schema = "ctgov", catalog = "AACT")
public class FacilityContacts {
    private int id;
    //private String nctId;
    //private Integer facilityId;
    private String contactType;
    private String name;
    private String email;
    private String phone;
    private Studies studiesByNctId;
    private Facilities facilitiesByFacilityId;

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
    @Column(name = "facility_id")
    public Integer getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Integer facilityId) {
        this.facilityId = facilityId;
    }*/

    @Basic
    @Column(name = "contact_type")
    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
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
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacilityContacts that = (FacilityContacts) o;
        return id == that.id &&
                Objects.equals(contactType, that.contactType) &&
                Objects.equals(name, that.name) &&
                Objects.equals(email, that.email) &&
                Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contactType, name, email, phone);
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
    @JoinColumn(name = "facility_id", referencedColumnName = "id")
    public Facilities getFacilitiesByFacilityId() {
        return facilitiesByFacilityId;
    }

    public void setFacilitiesByFacilityId(Facilities facilitiesByFacilityId) {
        this.facilitiesByFacilityId = facilitiesByFacilityId;
    }
}
