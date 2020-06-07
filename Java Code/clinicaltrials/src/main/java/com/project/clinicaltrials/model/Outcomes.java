package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Outcomes {
    private int id;
    //private String nctId;
    private String outcomeType;
    private String title;
    private String description;
    private String timeFrame;
    private String population;
    private Date anticipatedPostingDate;
    private String anticipatedPostingMonthYear;
    private String units;
    private String unitsAnalyzed;
    private String dispersionType;
    private String paramType;
    private Collection<OutcomeAnalyses> outcomeAnalysesById;
    private Collection<OutcomeCounts> outcomeCountsById;
    private Collection<OutcomeMeasurements> outcomeMeasurementsById;
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
    @Column(name = "outcome_type")
    public String getOutcomeType() {
        return outcomeType;
    }

    public void setOutcomeType(String outcomeType) {
        this.outcomeType = outcomeType;
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
    @Column(name = "time_frame")
    public String getTimeFrame() {
        return timeFrame;
    }

    public void setTimeFrame(String timeFrame) {
        this.timeFrame = timeFrame;
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
    @Column(name = "anticipated_posting_date")
    public Date getAnticipatedPostingDate() {
        return anticipatedPostingDate;
    }

    public void setAnticipatedPostingDate(Date anticipatedPostingDate) {
        this.anticipatedPostingDate = anticipatedPostingDate;
    }

    @Basic
    @Column(name = "anticipated_posting_month_year")
    public String getAnticipatedPostingMonthYear() {
        return anticipatedPostingMonthYear;
    }

    public void setAnticipatedPostingMonthYear(String anticipatedPostingMonthYear) {
        this.anticipatedPostingMonthYear = anticipatedPostingMonthYear;
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
    @Column(name = "units_analyzed")
    public String getUnitsAnalyzed() {
        return unitsAnalyzed;
    }

    public void setUnitsAnalyzed(String unitsAnalyzed) {
        this.unitsAnalyzed = unitsAnalyzed;
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
    @Column(name = "param_type")
    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Outcomes outcomes = (Outcomes) o;
        return id == outcomes.id &&
                Objects.equals(outcomeType, outcomes.outcomeType) &&
                Objects.equals(title, outcomes.title) &&
                Objects.equals(description, outcomes.description) &&
                Objects.equals(timeFrame, outcomes.timeFrame) &&
                Objects.equals(population, outcomes.population) &&
                Objects.equals(anticipatedPostingDate, outcomes.anticipatedPostingDate) &&
                Objects.equals(anticipatedPostingMonthYear, outcomes.anticipatedPostingMonthYear) &&
                Objects.equals(units, outcomes.units) &&
                Objects.equals(unitsAnalyzed, outcomes.unitsAnalyzed) &&
                Objects.equals(dispersionType, outcomes.dispersionType) &&
                Objects.equals(paramType, outcomes.paramType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, outcomeType, title, description, timeFrame, population, anticipatedPostingDate, anticipatedPostingMonthYear, units, unitsAnalyzed, dispersionType, paramType);
    }

    @OneToMany(mappedBy = "outcomesByOutcomeId")
    public Collection<OutcomeAnalyses> getOutcomeAnalysesById() {
        return outcomeAnalysesById;
    }

    public void setOutcomeAnalysesById(Collection<OutcomeAnalyses> outcomeAnalysesById) {
        this.outcomeAnalysesById = outcomeAnalysesById;
    }

    @OneToMany(mappedBy = "outcomesByOutcomeId")
    public Collection<OutcomeCounts> getOutcomeCountsById() {
        return outcomeCountsById;
    }

    public void setOutcomeCountsById(Collection<OutcomeCounts> outcomeCountsById) {
        this.outcomeCountsById = outcomeCountsById;
    }

    @OneToMany(mappedBy = "outcomesByOutcomeId")
    public Collection<OutcomeMeasurements> getOutcomeMeasurementsById() {
        return outcomeMeasurementsById;
    }

    public void setOutcomeMeasurementsById(Collection<OutcomeMeasurements> outcomeMeasurementsById) {
        this.outcomeMeasurementsById = outcomeMeasurementsById;
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
