package com.mars.marsimmigrants.model.entity;

/**
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.model.entity
 * @author杨帆
 * @date 2020/1/28 11:57 星期二
 */
public class NdNews {
    //新闻ID
    private int news_id;
    //发送人员
    private int news_type;
    //新闻标题
    private String news_title;
    //新闻内容
    private String news_content;
    //新闻发送人
    private String news_owner;
    //创建时间
    private String news_createdTime;

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

    public String getNews_createdTime() {
        return news_createdTime;
    }

    public void setNews_createdTime(String news_createdTime) {
        this.news_createdTime = news_createdTime;
    }
}
