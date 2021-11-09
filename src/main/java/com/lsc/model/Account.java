package com.lsc.model;

public class Account {

    private String command = "";
    private String msg = "";
    private boolean error = false;
    private boolean valid = false;
    private AccountEntries entries;
    private AccountErrors errors;
    private AccountMsgs msgs;

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

    public AccountEntries getEntries() {
        return entries;
    }

    public void setEntries(AccountEntries entries) {
        this.entries = entries;
    }

    public AccountErrors getErrors() {
        return errors;
    }

    public void setErrors(AccountErrors errors) {
        this.errors = errors;
    }

    public AccountMsgs getMsgs() {
        return msgs;
    }

    public void setMsgs(AccountMsgs msgs) {
        this.msgs = msgs;
    }
}
