package com.mars.marsimmigrants.model.entity;

import java.util.Date;

/**
 * @author 李陈
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.model
 * @date 2020/1/27 23:19 星期一
 */
public class News {
    //新闻id
    private  int news_id;
    //新闻发布人类型（商户，管理员）
    private int news_type;
    //新闻标题
    private String news_title;
    //新闻内容
    private String news_content;
    //新闻发布人
    private String news_owner;
    //新闻创建时间
    private Date news_createdTime;
    //新闻审核时间
    private Date news_verifiedTime;
    //新闻修改时间
    private Date news_updatedTime;
    //新闻优先级
    private  int news_level;
//    //新闻顺序
//    private int news_index;
    //新闻显示状态
    private int news_status;
    //新闻审核状态
    private  int news_verifiedStatus;
    //新闻操作状态（申请撤回，申请修改）
    private  int news_optionsStatus;

    public int getNews_id() {
        return news_id;
    }

    public void setNews_id(int news_id) {
        this.news_id = news_id;
    }

    public int getNews_type() {
        return news_type;
    }

    public void setNews_type(int news_type) {
        this.news_type = news_type;
    }

    public String getNews_title() {
        return news_title;
    }

    public void setNews_title(String news_title) {
        this.news_title = news_title;
    }

    public String getNews_content() {
        return news_content;
    }

    public void setNews_content(String news_content) {
        this.news_content = news_content;
    }

    public String getNews_owner() {
        return news_owner;
    }

    public void setNews_owner(String news_owner) {
        this.news_owner = news_owner;
    }

    public Date getNews_createdTime() {
        return news_createdTime;
    }

    public void setNews_createdTime(Date news_createdTime) {
        this.news_createdTime = news_createdTime;
    }

    public Date getNews_verifiedTime() {
        return news_verifiedTime;
    }

    public void setNews_verifiedTime(Date news_verifiedTime) {
        this.news_verifiedTime = news_verifiedTime;
    }

    public Date getNews_updatedTime() {
        return news_updatedTime;
    }

    public void setNews_updatedTime(Date news_updatedTime) {
        this.news_updatedTime = news_updatedTime;
    }

    public int getNews_level() {
        return news_level;
    }

    public void setNews_level(int news_level) {
        this.news_level = news_level;
    }

    public int getNews_status() {
        return news_status;
    }

    public void setNews_status(int news_status) {
        this.news_status = news_status;
    }

    public int getNews_verifiedStatus() {
        return news_verifiedStatus;
    }

    public void setNews_verifiedStatus(int news_verifiedStatus) {
        this.news_verifiedStatus = news_verifiedStatus;
    }

    public int getNews_optionsStatus() {
        return news_optionsStatus;
    }

    public void setNews_optionsStatus(int news_optionsStatus) {
        this.news_optionsStatus = news_optionsStatus;
    }

    public News() {
    }

    public News(int news_id, int news_type, String news_title, String news_content, String news_owner, Date news_createdTime, Date news_verifiedTime, Date news_updatedTime, int news_level, int news_status, int news_verifiedStatus, int news_optionsStatus) {
        this.news_id = news_id;
        this.news_type = news_type;
        this.news_title = news_title;
        this.news_content = news_content;
        this.news_owner = news_owner;
        this.news_createdTime = news_createdTime;
        this.news_verifiedTime = news_verifiedTime;
        this.news_updatedTime = news_updatedTime;
        this.news_level = news_level;
        this.news_status = news_status;
        this.news_verifiedStatus = news_verifiedStatus;
        this.news_optionsStatus = news_optionsStatus;
    }

}
