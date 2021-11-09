package com.lsc.mcarrier.entity;

import javax.persistence.*;

@Entity
@Table(name = "MREC_SECURITY_QUESTIONS")
@IdClass(MrecSecurityQuestionsEntityPK.class)
public class MrecSecurityQuestionsEntity {
    @Id
    @Column(name = "USERID")
    private String userid;

    @Column(name = "QUESTION")
    private String question;

    @Column(name = "ANSWER")
    private String answer;

    @Column(name = "SEQ_NBR")
    private int seqNbr;

    @Column(name = "CREATE_TS")
    private java.sql.Timestamp createTs;

    @Column(name = "CREATE_USERID")
    private String createUserid;

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

    public java.sql.Timestamp getCreateTs() {
        return createTs;
    }

    public void setCreateTs(java.sql.Timestamp createTs) {
        this.createTs = createTs;
    }

    public String getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
