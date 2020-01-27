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
    //新闻顺序
    private int news_index;
    //新闻显示状态
    private int news_status;
    //新闻审核状态
    private  int news_verifiedStatus;
    //新闻操作状态（申请撤回，申请修改）
    private  int news_optionsStatus;
}
