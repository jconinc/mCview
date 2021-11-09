package com.lsc.mcarrier.entity;

public class ListItem {
    private String tableN, tableCd, tableE;

    public ListItem(){

    }

    public ListItem(String tableN, String tableCd, String tableE) {
        this.tableN = tableN;
        this.tableCd = tableCd;
        this.tableE = tableE;
    }

    public String getTableE() {
        return tableE;
    }

    public void setTableE(String tableE) {
        this.tableE = tableE;
    }

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
}
