package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "design_groups", schema = "ctgov", catalog = "AACT")
public class DesignGroups {
    private int id;
    //private String nctId;
    private String groupType;
    private String title;
    private String description;
    private Collection<DesignGroupInterventions> designGroupInterventionsById;
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
    @Column(name = "group_type")
    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DesignGroups that = (DesignGroups) o;
        return id == that.id &&
                Objects.equals(groupType, that.groupType) &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, groupType, title, description);
    }

    @OneToMany(mappedBy = "designGroupsByDesignGroupId")
    public Collection<DesignGroupInterventions> getDesignGroupInterventionsById() {
        return designGroupInterventionsById;
    }

    public void setDesignGroupInterventionsById(Collection<DesignGroupInterventions> designGroupInterventionsById) {
        this.designGroupInterventionsById = designGroupInterventionsById;
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
