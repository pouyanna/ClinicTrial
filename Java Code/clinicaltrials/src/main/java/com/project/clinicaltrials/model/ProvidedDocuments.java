package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "provided_documents", schema = "ctgov", catalog = "AACT")
public class ProvidedDocuments {
    private int id;
    //private String nctId;
    private String documentType;
    private Boolean hasProtocol;
    private Boolean hasIcf;
    private Boolean hasSap;
    private Date documentDate;
    private String url;
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
    @Column(name = "document_type")
    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    @Basic
    @Column(name = "has_protocol")
    public Boolean getHasProtocol() {
        return hasProtocol;
    }

    public void setHasProtocol(Boolean hasProtocol) {
        this.hasProtocol = hasProtocol;
    }

    @Basic
    @Column(name = "has_icf")
    public Boolean getHasIcf() {
        return hasIcf;
    }

    public void setHasIcf(Boolean hasIcf) {
        this.hasIcf = hasIcf;
    }

    @Basic
    @Column(name = "has_sap")
    public Boolean getHasSap() {
        return hasSap;
    }

    public void setHasSap(Boolean hasSap) {
        this.hasSap = hasSap;
    }

    @Basic
    @Column(name = "document_date")
    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProvidedDocuments that = (ProvidedDocuments) o;
        return id == that.id &&
                Objects.equals(documentType, that.documentType) &&
                Objects.equals(hasProtocol, that.hasProtocol) &&
                Objects.equals(hasIcf, that.hasIcf) &&
                Objects.equals(hasSap, that.hasSap) &&
                Objects.equals(documentDate, that.documentDate) &&
                Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, documentType, hasProtocol, hasIcf, hasSap, documentDate, url);
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
