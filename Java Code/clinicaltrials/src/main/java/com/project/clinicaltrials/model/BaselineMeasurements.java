package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "baseline_measurements", schema = "ctgov", catalog = "AACT")
public class BaselineMeasurements {
    private int id;
    //private String nctId;
    //private Integer resultGroupId;
    private String ctgovGroupCode;
    private String classification;
    private String category;
    private String title;
    private String description;
    private String units;
    private String paramType;
    private String paramValue;
    private BigInteger paramValueNum;
    private String dispersionType;
    private String dispersionValue;
    private BigInteger dispersionValueNum;
    private BigInteger dispersionLowerLimit;
    private BigInteger dispersionUpperLimit;
    private String explanationOfNa;
    private Studies studiesByNctId;
    private ResultGroups resultGroupsByResultGroupId;

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
    @Column(name = "result_group_id")
    public Integer getResultGroupId() {
        return resultGroupId;
    }

    public void setResultGroupId(Integer resultGroupId) {
        this.resultGroupId = resultGroupId;
    }*/

    @Basic
    @Column(name = "ctgov_group_code")
    public String getCtgovGroupCode() {
        return ctgovGroupCode;
    }

    public void setCtgovGroupCode(String ctgovGroupCode) {
        this.ctgovGroupCode = ctgovGroupCode;
    }

    @Basic
    @Column(name = "classification")
    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Basic
    @Column(name = "category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "units")
    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
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
    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    @Basic
    @Column(name = "param_value_num")
    public BigInteger getParamValueNum() {
        return paramValueNum;
    }

    public void setParamValueNum(BigInteger paramValueNum) {
        this.paramValueNum = paramValueNum;
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
    public String getDispersionValue() {
        return dispersionValue;
    }

    public void setDispersionValue(String dispersionValue) {
        this.dispersionValue = dispersionValue;
    }

    @Basic
    @Column(name = "dispersion_value_num")
    public BigInteger getDispersionValueNum() {
        return dispersionValueNum;
    }

    public void setDispersionValueNum(BigInteger dispersionValueNum) {
        this.dispersionValueNum = dispersionValueNum;
    }

    @Basic
    @Column(name = "dispersion_lower_limit")
    public BigInteger getDispersionLowerLimit() {
        return dispersionLowerLimit;
    }

    public void setDispersionLowerLimit(BigInteger dispersionLowerLimit) {
        this.dispersionLowerLimit = dispersionLowerLimit;
    }

    @Basic
    @Column(name = "dispersion_upper_limit")
    public BigInteger getDispersionUpperLimit() {
        return dispersionUpperLimit;
    }

    public void setDispersionUpperLimit(BigInteger dispersionUpperLimit) {
        this.dispersionUpperLimit = dispersionUpperLimit;
    }

    @Basic
    @Column(name = "explanation_of_na")
    public String getExplanationOfNa() {
        return explanationOfNa;
    }

    public void setExplanationOfNa(String explanationOfNa) {
        this.explanationOfNa = explanationOfNa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaselineMeasurements that = (BaselineMeasurements) o;
        return id == that.id &&
                Objects.equals(ctgovGroupCode, that.ctgovGroupCode) &&
                Objects.equals(classification, that.classification) &&
                Objects.equals(category, that.category) &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(units, that.units) &&
                Objects.equals(paramType, that.paramType) &&
                Objects.equals(paramValue, that.paramValue) &&
                Objects.equals(paramValueNum, that.paramValueNum) &&
                Objects.equals(dispersionType, that.dispersionType) &&
                Objects.equals(dispersionValue, that.dispersionValue) &&
                Objects.equals(dispersionValueNum, that.dispersionValueNum) &&
                Objects.equals(dispersionLowerLimit, that.dispersionLowerLimit) &&
                Objects.equals(dispersionUpperLimit, that.dispersionUpperLimit) &&
                Objects.equals(explanationOfNa, that.explanationOfNa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ctgovGroupCode, classification, category, title, description, units, paramType, paramValue, paramValueNum, dispersionType, dispersionValue, dispersionValueNum, dispersionLowerLimit, dispersionUpperLimit, explanationOfNa);
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
    @JoinColumn(name = "result_group_id", referencedColumnName = "id")
    public ResultGroups getResultGroupsByResultGroupId() {
        return resultGroupsByResultGroupId;
    }

    public void setResultGroupsByResultGroupId(ResultGroups resultGroupsByResultGroupId) {
        this.resultGroupsByResultGroupId = resultGroupsByResultGroupId;
    }
}
