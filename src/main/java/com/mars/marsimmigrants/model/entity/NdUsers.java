package com.mars.marsimmigrants.model.entity;

public class NdUsers {
    private String user_id;
    private String user_web_name;
    private String user_phone;
    private String user_password;
    private String user_wechart;
    private Integer user_role;
    private Integer user_status;

    @Override
    public String toString() {
        return "NdUsers{" +
                "user_id='" + user_id + '\'' +
                ", user_web_name='" + user_web_name + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_wechart='" + user_wechart + '\'' +
                ", user_role=" + user_role +
                ", user_status=" + user_status +
                '}';
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_web_name() {
        return user_web_name;
    }

    public void setUser_web_name(String user_web_name) {
        this.user_web_name = user_web_name;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_wechart() {
        return user_wechart;
    }

    public void setUser_wechart(String user_wechart) {
        this.user_wechart = user_wechart;
    }

    public Integer getUser_role() {
        return user_role;
    }

    public void setUser_role(Integer user_role) {
        this.user_role = user_role;
    }

    public Integer getUser_status() {
        return user_status;
    }

    public void setUser_status(Integer user_status) {
        this.user_status = user_status;
    }
}
