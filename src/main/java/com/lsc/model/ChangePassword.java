package com.lsc.model;

public class ChangePassword {

    private String userid;
    private String new_password1;
    private boolean new_password1_error;
    private String new_password1_msg;
    private String new_password2;
    private boolean new_password2_error;
    private String new_password2_msg;
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

    public String getNew_password1() {
        return new_password1;
    }

    public void setNew_password1(String new_password1) {
        this.new_password1 = new_password1;
    }

    public boolean isNew_password1_error() {
        return new_password1_error;
    }

    public void setNew_password1_error(boolean new_password1_error) {
        this.new_password1_error = new_password1_error;
    }

    public String getNew_password1_msg() {
        return new_password1_msg;
    }

    public void setNew_password1_msg(String new_password1_msg) {
        this.new_password1_msg = new_password1_msg;
    }

    public String getNew_password2() {
        return new_password2;
    }

    public void setNew_password2(String new_password2) {
        this.new_password2 = new_password2;
    }

    public boolean isNew_password2_error() {
        return new_password2_error;
    }

    public void setNew_password2_error(boolean new_password2_error) {
        this.new_password2_error = new_password2_error;
    }

    public String getNew_password2_msg() {
        return new_password2_msg;
    }

    public void setNew_password2_msg(String new_password2_msg) {
        this.new_password2_msg = new_password2_msg;
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
