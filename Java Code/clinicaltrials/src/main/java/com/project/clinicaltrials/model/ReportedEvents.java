package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "reported_events", schema = "ctgov", catalog = "AACT")
public class ReportedEvents {
    private int id;
    //private String nctId;
    //private Integer resultGroupId;
    private String ctgovGroupCode;
    private String timeFrame;
    private String eventType;
    private String defaultVocab;
    private String defaultAssessment;
    private Integer subjectsAffected;
    private Integer subjectsAtRisk;
    private String description;
    private Integer eventCount;
    private String organSystem;
    private String adverseEventTerm;
    private Integer frequencyThreshold;
    private String vocab;
    private String assessment;
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
    @Column(name = "time_frame")
    public String getTimeFrame() {
        return timeFrame;
    }

    public void setTimeFrame(String timeFrame) {
        this.timeFrame = timeFrame;
    }

    @Basic
    @Column(name = "event_type")
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Basic
    @Column(name = "default_vocab")
    public String getDefaultVocab() {
        return defaultVocab;
    }

    public void setDefaultVocab(String defaultVocab) {
        this.defaultVocab = defaultVocab;
    }

    @Basic
    @Column(name = "default_assessment")
    public String getDefaultAssessment() {
        return defaultAssessment;
    }

    public void setDefaultAssessment(String defaultAssessment) {
        this.defaultAssessment = defaultAssessment;
    }

    @Basic
    @Column(name = "subjects_affected")
    public Integer getSubjectsAffected() {
        return subjectsAffected;
    }

    public void setSubjectsAffected(Integer subjectsAffected) {
        this.subjectsAffected = subjectsAffected;
    }

    @Basic
    @Column(name = "subjects_at_risk")
    public Integer getSubjectsAtRisk() {
        return subjectsAtRisk;
    }

    public void setSubjectsAtRisk(Integer subjectsAtRisk) {
        this.subjectsAtRisk = subjectsAtRisk;
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
    @Column(name = "event_count")
    public Integer getEventCount() {
        return eventCount;
    }

    public void setEventCount(Integer eventCount) {
        this.eventCount = eventCount;
    }

    @Basic
    @Column(name = "organ_system")
    public String getOrganSystem() {
        return organSystem;
    }

    public void setOrganSystem(String organSystem) {
        this.organSystem = organSystem;
    }

    @Basic
    @Column(name = "adverse_event_term")
    public String getAdverseEventTerm() {
        return adverseEventTerm;
    }

    public void setAdverseEventTerm(String adverseEventTerm) {
        this.adverseEventTerm = adverseEventTerm;
    }

    @Basic
    @Column(name = "frequency_threshold")
    public Integer getFrequencyThreshold() {
        return frequencyThreshold;
    }

    public void setFrequencyThreshold(Integer frequencyThreshold) {
        this.frequencyThreshold = frequencyThreshold;
    }

    @Basic
    @Column(name = "vocab")
    public String getVocab() {
        return vocab;
    }

    public void setVocab(String vocab) {
        this.vocab = vocab;
    }

    @Basic
    @Column(name = "assessment")
    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReportedEvents that = (ReportedEvents) o;
        return id == that.id &&
                Objects.equals(ctgovGroupCode, that.ctgovGroupCode) &&
                Objects.equals(timeFrame, that.timeFrame) &&
                Objects.equals(eventType, that.eventType) &&
                Objects.equals(defaultVocab, that.defaultVocab) &&
                Objects.equals(defaultAssessment, that.defaultAssessment) &&
                Objects.equals(subjectsAffected, that.subjectsAffected) &&
                Objects.equals(subjectsAtRisk, that.subjectsAtRisk) &&
                Objects.equals(description, that.description) &&
                Objects.equals(eventCount, that.eventCount) &&
                Objects.equals(organSystem, that.organSystem) &&
                Objects.equals(adverseEventTerm, that.adverseEventTerm) &&
                Objects.equals(frequencyThreshold, that.frequencyThreshold) &&
                Objects.equals(vocab, that.vocab) &&
                Objects.equals(assessment, that.assessment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ctgovGroupCode, timeFrame, eventType, defaultVocab, defaultAssessment, subjectsAffected, subjectsAtRisk, description, eventCount, organSystem, adverseEventTerm, frequencyThreshold, vocab, assessment);
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
