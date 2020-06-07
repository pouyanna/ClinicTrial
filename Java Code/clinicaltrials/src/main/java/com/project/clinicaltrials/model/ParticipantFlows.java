package com.project.clinicaltrials.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "participant_flows", schema = "ctgov", catalog = "AACT")
public class ParticipantFlows {
    private int id;
    //private String nctId;
    private String recruitmentDetails;
    private String preAssignmentDetails;
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
    @Column(name = "recruitment_details")
    public String getRecruitmentDetails() {
        return recruitmentDetails;
    }

    public void setRecruitmentDetails(String recruitmentDetails) {
        this.recruitmentDetails = recruitmentDetails;
    }

    @Basic
    @Column(name = "pre_assignment_details")
    public String getPreAssignmentDetails() {
        return preAssignmentDetails;
    }

    public void setPreAssignmentDetails(String preAssignmentDetails) {
        this.preAssignmentDetails = preAssignmentDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParticipantFlows that = (ParticipantFlows) o;
        return id == that.id &&
                Objects.equals(recruitmentDetails, that.recruitmentDetails) &&
                Objects.equals(preAssignmentDetails, that.preAssignmentDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, recruitmentDetails, preAssignmentDetails);
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
