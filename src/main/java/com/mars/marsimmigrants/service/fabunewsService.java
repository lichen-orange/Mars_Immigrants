package com.mars.marsimmigrants.service;

import org.apache.ibatis.annotations.Param;

/**
 * @author 韩帅龙
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.service
 * @date 2020/1/29 11:21 星期三
 */
public interface fabunewsService {
    /**
     * 添加新闻
     * @param title 标题
     * @param Content 内容
     * @param owner 作者
     * @param createdTime 创建时间
     * @param updateTime   更新时间
     * @return
     */
    int addnews( String title,  String Content, String owner,  String createdTime,  String updateTime);
}
