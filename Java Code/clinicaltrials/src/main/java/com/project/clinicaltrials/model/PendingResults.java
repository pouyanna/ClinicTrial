package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "pending_results", schema = "ctgov", catalog = "AACT")
public class PendingResults {
    private int id;
    //private String nctId;
    private String event;
    private String eventDateDescription;
    private Date eventDate;
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
    @Column(name = "event")
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @Basic
    @Column(name = "event_date_description")
    public String getEventDateDescription() {
        return eventDateDescription;
    }

    public void setEventDateDescription(String eventDateDescription) {
        this.eventDateDescription = eventDateDescription;
    }

    @Basic
    @Column(name = "event_date")
    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PendingResults that = (PendingResults) o;
        return id == that.id &&
                Objects.equals(event, that.event) &&
                Objects.equals(eventDateDescription, that.eventDateDescription) &&
                Objects.equals(eventDate, that.eventDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, event, eventDateDescription, eventDate);
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
