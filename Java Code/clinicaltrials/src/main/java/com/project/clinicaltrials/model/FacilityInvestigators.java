package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "facility_investigators", schema = "ctgov", catalog = "AACT")
public class FacilityInvestigators {
    private int id;
    //private String nctId;
    //private Integer facilityId;
    private String role;
    private String name;
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
    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
        FacilityInvestigators that = (FacilityInvestigators) o;
        return id == that.id &&
                Objects.equals(role, that.role) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, role, name);
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
