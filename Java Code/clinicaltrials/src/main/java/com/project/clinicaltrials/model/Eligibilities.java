package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Eligibilities {
    private int id;
    //private String nctId;
    private String samplingMethod;
    private String gender;
    private String minimumAge;
    private String maximumAge;
    private String healthyVolunteers;
    private String population;
    private String criteria;
    private String genderDescription;
    private Boolean genderBased;
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
    @Column(name = "sampling_method")
    public String getSamplingMethod() {
        return samplingMethod;
    }

    public void setSamplingMethod(String samplingMethod) {
        this.samplingMethod = samplingMethod;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "minimum_age")
    public String getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(String minimumAge) {
        this.minimumAge = minimumAge;
    }

    @Basic
    @Column(name = "maximum_age")
    public String getMaximumAge() {
        return maximumAge;
    }

    public void setMaximumAge(String maximumAge) {
        this.maximumAge = maximumAge;
    }

    @Basic
    @Column(name = "healthy_volunteers")
    public String getHealthyVolunteers() {
        return healthyVolunteers;
    }

    public void setHealthyVolunteers(String healthyVolunteers) {
        this.healthyVolunteers = healthyVolunteers;
    }

    @Basic
    @Column(name = "population")
    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    @Basic
    @Column(name = "criteria")
    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    @Basic
    @Column(name = "gender_description")
    public String getGenderDescription() {
        return genderDescription;
    }

    public void setGenderDescription(String genderDescription) {
        this.genderDescription = genderDescription;
    }

    @Basic
    @Column(name = "gender_based")
    public Boolean getGenderBased() {
        return genderBased;
    }

    public void setGenderBased(Boolean genderBased) {
        this.genderBased = genderBased;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Eligibilities that = (Eligibilities) o;
        return id == that.id &&
                Objects.equals(samplingMethod, that.samplingMethod) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(minimumAge, that.minimumAge) &&
                Objects.equals(maximumAge, that.maximumAge) &&
                Objects.equals(healthyVolunteers, that.healthyVolunteers) &&
                Objects.equals(population, that.population) &&
                Objects.equals(criteria, that.criteria) &&
                Objects.equals(genderDescription, that.genderDescription) &&
                Objects.equals(genderBased, that.genderBased);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, samplingMethod, gender, minimumAge, maximumAge, healthyVolunteers, population, criteria, genderDescription, genderBased);
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
