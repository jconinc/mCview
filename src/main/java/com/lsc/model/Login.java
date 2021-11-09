package com.lsc.model;

public class Login {

    private String userid;
    private boolean userid_error;
    private String userid_msg;
    private String password;
    private boolean password_error;
    private String password_msg;
    private boolean main_error;
    private String main_msg;
    private boolean valid;
    private String command;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public boolean isUserid_error() {
        return userid_error;
    }

    public void setUserid_error(boolean userid_error) {
        this.userid_error = userid_error;
    }

    public String getUserid_msg() {
        return userid_msg;
    }

    public void setUserid_msg(String userid_msg) {
        this.userid_msg = userid_msg;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPassword_error() {
        return password_error;
    }

    public void setPassword_error(boolean password_error) {
        this.password_error = password_error;
    }

    public String getPassword_msg() {
        return password_msg;
    }

    public void setPassword_msg(String password_msg) {
        this.password_msg = password_msg;
    }

    public boolean isMain_error() {
        return main_error;
    }

    public void setMain_error(boolean main_error) {
        this.main_error = main_error;
    }

    public String getMain_msg() {
        return main_msg;
    }

    public void setMain_msg(String main_msg) {
        this.main_msg = main_msg;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
}
