package com.lsc.model;

public class CodeTable {
    private String tableE, tableCd;

    public CodeTable(){

    }

    public CodeTable(String tableE, String tableCd) {
        this.tableE = tableE;
        this.tableCd = tableCd;
    }

    public String getTableE() {
        return tableE;
    }

    public void setTableE(String tableE) {
        this.tableE = tableE;
    }

    public String getTableCd() {
        return tableCd;
    }

    public void setTableCd(String tableCd) {
        this.tableCd = tableCd;
    }
}
