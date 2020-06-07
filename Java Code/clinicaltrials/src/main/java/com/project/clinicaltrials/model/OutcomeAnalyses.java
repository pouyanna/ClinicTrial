package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "outcome_analyses", schema = "ctgov", catalog = "AACT")
public class OutcomeAnalyses {
    private int id;
    //private String nctId;
    //private Integer outcomeId;
    private String nonInferiorityType;
    private String nonInferiorityDescription;
    private String paramType;
    private BigInteger paramValue;
    private String dispersionType;
    private BigInteger dispersionValue;
    private String pValueModifier;
    private Double pValue;
    private String ciNSides;
    private BigInteger ciPercent;
    private BigInteger ciLowerLimit;
    private BigInteger ciUpperLimit;
    private String ciUpperLimitNaComment;
    private String pValueDescription;
    private String method;
    private String methodDescription;
    private String estimateDescription;
    private String groupsDescription;
    private String otherAnalysisDescription;
    private Studies studiesByNctId;
    private Outcomes outcomesByOutcomeId;
    private Collection<OutcomeAnalysisGroups> outcomeAnalysisGroupsById;

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
    @Column(name = "outcome_id")
    public Integer getOutcomeId() {
        return outcomeId;
    }

    public void setOutcomeId(Integer outcomeId) {
        this.outcomeId = outcomeId;
    }*/

    @Basic
    @Column(name = "non_inferiority_type")
    public String getNonInferiorityType() {
        return nonInferiorityType;
    }

    public void setNonInferiorityType(String nonInferiorityType) {
        this.nonInferiorityType = nonInferiorityType;
    }

    @Basic
    @Column(name = "non_inferiority_description")
    public String getNonInferiorityDescription() {
        return nonInferiorityDescription;
    }

    public void setNonInferiorityDescription(String nonInferiorityDescription) {
        this.nonInferiorityDescription = nonInferiorityDescription;
    }

    @Basic
    @Column(name = "param_type")
    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    @Basic
    @Column(name = "param_value")
    public BigInteger getParamValue() {
        return paramValue;
    }

    public void setParamValue(BigInteger paramValue) {
        this.paramValue = paramValue;
    }

    @Basic
    @Column(name = "dispersion_type")
    public String getDispersionType() {
        return dispersionType;
    }

    public void setDispersionType(String dispersionType) {
        this.dispersionType = dispersionType;
    }

    @Basic
    @Column(name = "dispersion_value")
    public BigInteger getDispersionValue() {
        return dispersionValue;
    }

    public void setDispersionValue(BigInteger dispersionValue) {
        this.dispersionValue = dispersionValue;
    }

    @Basic
    @Column(name = "p_value_modifier")
    public String getpValueModifier() {
        return pValueModifier;
    }

    public void setpValueModifier(String pValueModifier) {
        this.pValueModifier = pValueModifier;
    }

    @Basic
    @Column(name = "p_value")
    public Double getpValue() {
        return pValue;
    }

    public void setpValue(Double pValue) {
        this.pValue = pValue;
    }

    @Basic
    @Column(name = "ci_n_sides")
    public String getCiNSides() {
        return ciNSides;
    }

    public void setCiNSides(String ciNSides) {
        this.ciNSides = ciNSides;
    }

    @Basic
    @Column(name = "ci_percent")
    public BigInteger getCiPercent() {
        return ciPercent;
    }

    public void setCiPercent(BigInteger ciPercent) {
        this.ciPercent = ciPercent;
    }

    @Basic
    @Column(name = "ci_lower_limit")
    public BigInteger getCiLowerLimit() {
        return ciLowerLimit;
    }

    public void setCiLowerLimit(BigInteger ciLowerLimit) {
        this.ciLowerLimit = ciLowerLimit;
    }

    @Basic
    @Column(name = "ci_upper_limit")
    public BigInteger getCiUpperLimit() {
        return ciUpperLimit;
    }

    public void setCiUpperLimit(BigInteger ciUpperLimit) {
        this.ciUpperLimit = ciUpperLimit;
    }

    @Basic
    @Column(name = "ci_upper_limit_na_comment")
    public String getCiUpperLimitNaComment() {
        return ciUpperLimitNaComment;
    }

    public void setCiUpperLimitNaComment(String ciUpperLimitNaComment) {
        this.ciUpperLimitNaComment = ciUpperLimitNaComment;
    }

    @Basic
    @Column(name = "p_value_description")
    public String getpValueDescription() {
        return pValueDescription;
    }

    public void setpValueDescription(String pValueDescription) {
        this.pValueDescription = pValueDescription;
    }

    @Basic
    @Column(name = "method")
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Basic
    @Column(name = "method_description")
    public String getMethodDescription() {
        return methodDescription;
    }

    public void setMethodDescription(String methodDescription) {
        this.methodDescription = methodDescription;
    }

    @Basic
    @Column(name = "estimate_description")
    public String getEstimateDescription() {
        return estimateDescription;
    }

    public void setEstimateDescription(String estimateDescription) {
        this.estimateDescription = estimateDescription;
    }

    @Basic
    @Column(name = "groups_description")
    public String getGroupsDescription() {
        return groupsDescription;
    }

    public void setGroupsDescription(String groupsDescription) {
        this.groupsDescription = groupsDescription;
    }

    @Basic
    @Column(name = "other_analysis_description")
    public String getOtherAnalysisDescription() {
        return otherAnalysisDescription;
    }

    public void setOtherAnalysisDescription(String otherAnalysisDescription) {
        this.otherAnalysisDescription = otherAnalysisDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutcomeAnalyses that = (OutcomeAnalyses) o;
        return id == that.id &&
                Objects.equals(nonInferiorityType, that.nonInferiorityType) &&
                Objects.equals(nonInferiorityDescription, that.nonInferiorityDescription) &&
                Objects.equals(paramType, that.paramType) &&
                Objects.equals(paramValue, that.paramValue) &&
                Objects.equals(dispersionType, that.dispersionType) &&
                Objects.equals(dispersionValue, that.dispersionValue) &&
                Objects.equals(pValueModifier, that.pValueModifier) &&
                Objects.equals(pValue, that.pValue) &&
                Objects.equals(ciNSides, that.ciNSides) &&
                Objects.equals(ciPercent, that.ciPercent) &&
                Objects.equals(ciLowerLimit, that.ciLowerLimit) &&
                Objects.equals(ciUpperLimit, that.ciUpperLimit) &&
                Objects.equals(ciUpperLimitNaComment, that.ciUpperLimitNaComment) &&
                Objects.equals(pValueDescription, that.pValueDescription) &&
                Objects.equals(method, that.method) &&
                Objects.equals(methodDescription, that.methodDescription) &&
                Objects.equals(estimateDescription, that.estimateDescription) &&
                Objects.equals(groupsDescription, that.groupsDescription) &&
                Objects.equals(otherAnalysisDescription, that.otherAnalysisDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nonInferiorityType, nonInferiorityDescription, paramType, paramValue, dispersionType, dispersionValue, pValueModifier, pValue, ciNSides, ciPercent, ciLowerLimit, ciUpperLimit, ciUpperLimitNaComment, pValueDescription, method, methodDescription, estimateDescription, groupsDescription, otherAnalysisDescription);
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
    @JoinColumn(name = "outcome_id", referencedColumnName = "id")
    public Outcomes getOutcomesByOutcomeId() {
        return outcomesByOutcomeId;
    }

    public void setOutcomesByOutcomeId(Outcomes outcomesByOutcomeId) {
        this.outcomesByOutcomeId = outcomesByOutcomeId;
    }

    @OneToMany(mappedBy = "outcomeAnalysesByOutcomeAnalysisId")
    public Collection<OutcomeAnalysisGroups> getOutcomeAnalysisGroupsById() {
        return outcomeAnalysisGroupsById;
    }

    public void setOutcomeAnalysisGroupsById(Collection<OutcomeAnalysisGroups> outcomeAnalysisGroupsById) {
        this.outcomeAnalysisGroupsById = outcomeAnalysisGroupsById;
    }
}
