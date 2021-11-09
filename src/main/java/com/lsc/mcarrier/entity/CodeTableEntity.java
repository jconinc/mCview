package com.lsc.mcarrier.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "CODE_TABLE")
@IdClass(CodeTableEntityPK.class)
public class CodeTableEntity  {
    @Id
    @Column(name = "TABLE_N")
    private String tableN;

    @Id
    @Column(name = "TABLE_CD")
    private String tableCd;

    @Basic// unnecessary, this is assumed
    @Column(name = "TABLE_E")
    private String tableE;

    @Id
    @Column(name = "LAST_UPDT_TS")
    private Date lastUpdtTs;

    @Basic
    @Column(name = "LAST_UPDT_USERID")
    private String lastUpdtUserid;

    public String getTableN() {
        return tableN;
    }

    public void setTableN(String tableN) {
        this.tableN = tableN;
    }

    public String getTableCd() {
        return tableCd;
    }

    public void setTableCd(String tableCd) {
        this.tableCd = tableCd;
    }

    public String getTableE() {
        return tableE;
    }

    public void setTableE(String tableE) {
        this.tableE = tableE;
    }

    public Date getLastUpdtTs() {
        return lastUpdtTs;
    }

    public void setLastUpdtTs(Date lastUpdtTs) {
        this.lastUpdtTs = lastUpdtTs;
    }

    public String getLastUpdtUserid() {
        return lastUpdtUserid;
    }

    public void setLastUpdtUserid(String lastUpdtUserid) {
        this.lastUpdtUserid = lastUpdtUserid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodeTableEntity that = (CodeTableEntity) o;
        return Objects.equals(tableN, that.tableN) &&
                Objects.equals(tableCd, that.tableCd) &&
                Objects.equals(tableE, that.tableE) &&
                Objects.equals(lastUpdtTs, that.lastUpdtTs) &&
                Objects.equals(lastUpdtUserid, that.lastUpdtUserid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tableN, tableCd, tableE, lastUpdtTs, lastUpdtUserid);
    }
}
