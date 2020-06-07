package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "study_references", schema = "ctgov", catalog = "AACT")
public class StudyReferences {
    private int id;
    //private String nctId;
    private String pmid;
    private String referenceType;
    private String citation;
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
    @Column(name = "pmid")
    public String getPmid() {
        return pmid;
    }

    public void setPmid(String pmid) {
        this.pmid = pmid;
    }

    @Basic
    @Column(name = "reference_type")
    public String getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    @Basic
    @Column(name = "citation")
    public String getCitation() {
        return citation;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudyReferences that = (StudyReferences) o;
        return id == that.id &&
                Objects.equals(pmid, that.pmid) &&
                Objects.equals(referenceType, that.referenceType) &&
                Objects.equals(citation, that.citation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pmid, referenceType, citation);
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
