package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "browse_interventions", schema = "ctgov", catalog = "AACT")
public class BrowseInterventions {
    private int id;
    //private String nctId;
    private String meshTerm;
    private String downcaseMeshTerm;
    private Studies studiesByNctId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    @Basic
//    @Column(name = "nct_id")
//    public String getNctId() {
//        return nctId;
//    }
//
//    public void setNctId(String nctId) {
//        this.nctId = nctId;
//    }

    @Basic
    @Column(name = "mesh_term")
    public String getMeshTerm() {
        return meshTerm;
    }

    public void setMeshTerm(String meshTerm) {
        this.meshTerm = meshTerm;
    }

    @Basic
    @Column(name = "downcase_mesh_term")
    public String getDowncaseMeshTerm() {
        return downcaseMeshTerm;
    }

    public void setDowncaseMeshTerm(String downcaseMeshTerm) {
        this.downcaseMeshTerm = downcaseMeshTerm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrowseInterventions that = (BrowseInterventions) o;
        return id == that.id &&
                Objects.equals(meshTerm, that.meshTerm) &&
                Objects.equals(downcaseMeshTerm, that.downcaseMeshTerm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, meshTerm, downcaseMeshTerm);
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
