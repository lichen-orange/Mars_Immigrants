package com.mars.marsimmigrants.model.entity;

/**
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.model.entity
 * @author杨帆
 * @date 2020/1/28 12:09 星期二
 */
public class NdUnite {
    private int id;
    private String title;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public NdUnite(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
