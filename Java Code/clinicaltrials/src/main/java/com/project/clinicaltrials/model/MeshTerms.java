package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "mesh_terms", schema = "ctgov", catalog = "AACT")
public class MeshTerms {
    private int id;
    private String qualifier;
    private String treeNumber;
    private String description;
    private String meshTerm;
    private String downcaseMeshTerm;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "qualifier")
    public String getQualifier() {
        return qualifier;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    @Basic
    @Column(name = "tree_number")
    public String getTreeNumber() {
        return treeNumber;
    }

    public void setTreeNumber(String treeNumber) {
        this.treeNumber = treeNumber;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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
        MeshTerms meshTerms = (MeshTerms) o;
        return id == meshTerms.id &&
                Objects.equals(qualifier, meshTerms.qualifier) &&
                Objects.equals(treeNumber, meshTerms.treeNumber) &&
                Objects.equals(description, meshTerms.description) &&
                Objects.equals(meshTerm, meshTerms.meshTerm) &&
                Objects.equals(downcaseMeshTerm, meshTerms.downcaseMeshTerm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, qualifier, treeNumber, description, meshTerm, downcaseMeshTerm);
    }
}
