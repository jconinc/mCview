package com.lsc.mcarrier.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class MrecSecurityQuestionsEntityPK implements Serializable {
    @Id
    @Column(name = "USERID")
    private String userid;

    @Id
    @Column(name = "SEQ_NBR")
    private int seqNbr;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public int getSeqNbr() {
        return seqNbr;
    }

    public void setSeqNbr(int seqNbr) {
        this.seqNbr = seqNbr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MrecSecurityQuestionsEntityPK that = (MrecSecurityQuestionsEntityPK) o;
        return Objects.equals(userid, that.userid) &&
                Objects.equals(seqNbr, that.seqNbr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid);
    }
}
