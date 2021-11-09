package com.lsc.model;

import java.util.List;

public class Organization {
    private String command = "";
    private String msg = "";
    private boolean error = false;
    private boolean valid = false;
    private OrganizationEntries entries;
    private OrganizationErrors errors;
    private OrganizationMsgs msgs;
    private OrganizationEntries active;
    private List<OrganizationEntries> owned;
    private List<OrganizationEntries> contributing;

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public OrganizationEntries getEntries() {
        return entries;
    }

    public void setEntries(OrganizationEntries entries) {
        this.entries = entries;
    }

    public OrganizationErrors getErrors() {
        return errors;
    }

    public void setErrors(OrganizationErrors errors) {
        this.errors = errors;
    }

    public OrganizationMsgs getMsgs() {
        return msgs;
    }

    public void setMsgs(OrganizationMsgs msgs) {
        this.msgs = msgs;
    }

    public OrganizationEntries getActive() {
        return active;
    }

    public void setActive(OrganizationEntries active) {
        this.active = active;
    }

    public List<OrganizationEntries> getOwned() {
        return owned;
    }

    public void setOwned(List<OrganizationEntries> owned) {
        this.owned = owned;
    }

    public List<OrganizationEntries> getContributing() {
        return contributing;
    }

    public void setContributing(List<OrganizationEntries> contributing) {
        this.contributing = contributing;
    }
}
