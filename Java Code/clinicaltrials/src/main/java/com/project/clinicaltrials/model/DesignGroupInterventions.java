package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "design_group_interventions", schema = "ctgov", catalog = "AACT")
public class DesignGroupInterventions {
    private int id;
    //private String nctId;
    //private Integer designGroupId;
    //private Integer interventionId;
    private Studies studiesByNctId;
    private DesignGroups designGroupsByDesignGroupId;
    private Interventions interventionsByInterventionId;

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

//    @Basic
//    @Column(name = "design_group_id")
//    public Integer getDesignGroupId() {
//        return designGroupId;
//    }
//
//    public void setDesignGroupId(Integer designGroupId) {
//        this.designGroupId = designGroupId;
//    }

    /*@Basic
    @Column(name = "intervention_id")
    public Integer getInterventionId() {
        return interventionId;
    }

    public void setInterventionId(Integer interventionId) {
        this.interventionId = interventionId;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DesignGroupInterventions that = (DesignGroupInterventions) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
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
    @JoinColumn(name = "design_group_id", referencedColumnName = "id")
    public DesignGroups getDesignGroupsByDesignGroupId() {
        return designGroupsByDesignGroupId;
    }

    public void setDesignGroupsByDesignGroupId(DesignGroups designGroupsByDesignGroupId) {
        this.designGroupsByDesignGroupId = designGroupsByDesignGroupId;
    }

    @ManyToOne
    @JoinColumn(name = "intervention_id", referencedColumnName = "id")
    public Interventions getInterventionsByInterventionId() {
        return interventionsByInterventionId;
    }

    public void setInterventionsByInterventionId(Interventions interventionsByInterventionId) {
        this.interventionsByInterventionId = interventionsByInterventionId;
    }
}
