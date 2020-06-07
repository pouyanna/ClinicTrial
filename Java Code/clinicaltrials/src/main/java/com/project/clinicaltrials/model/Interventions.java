package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Interventions {
    private int id;
    //private String nctId;
    private String interventionType;
    private String name;
    private String description;
    private Collection<DesignGroupInterventions> designGroupInterventionsById;
    private Collection<InterventionOtherNames> interventionOtherNamesById;
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
    @Column(name = "intervention_type")
    public String getInterventionType() {
        return interventionType;
    }

    public void setInterventionType(String interventionType) {
        this.interventionType = interventionType;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interventions that = (Interventions) o;
        return id == that.id &&
                Objects.equals(interventionType, that.interventionType) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, interventionType, name, description);
    }

    @OneToMany(mappedBy = "interventionsByInterventionId")
    public Collection<DesignGroupInterventions> getDesignGroupInterventionsById() {
        return designGroupInterventionsById;
    }

    public void setDesignGroupInterventionsById(Collection<DesignGroupInterventions> designGroupInterventionsById) {
        this.designGroupInterventionsById = designGroupInterventionsById;
    }

    @OneToMany(mappedBy = "interventionsByInterventionId")
    public Collection<InterventionOtherNames> getInterventionOtherNamesById() {
        return interventionOtherNamesById;
    }

    public void setInterventionOtherNamesById(Collection<InterventionOtherNames> interventionOtherNamesById) {
        this.interventionOtherNamesById = interventionOtherNamesById;
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
