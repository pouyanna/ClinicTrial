package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Keywords {
    private int id;
    //private String nctId;
    private String name;
    private String downcaseName;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "downcase_name")
    public String getDowncaseName() {
        return downcaseName;
    }

    public void setDowncaseName(String downcaseName) {
        this.downcaseName = downcaseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Keywords keywords = (Keywords) o;
        return id == keywords.id &&
                Objects.equals(name, keywords.name) &&
                Objects.equals(downcaseName, keywords.downcaseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, downcaseName);
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
