package com.mars.marsimmigrants.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @author 韩帅龙
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.mapper
 * @date 2020/1/28 17:32 星期二
 */
public interface fabunews {

    /**
     * 发布新闻
     * @param title 新闻的标题
     * @param Content 新闻的内容
     * @param owner  新闻的作者
     * @param createdTime 新闻的创建时间
     * @param updateTime 新闻的修改时间
     * @return
     */
    int addnews(@Param(value = "title") String title,@Param(value = "Content") String Content,@Param(value = "owner") String owner,@Param(value = "createTime") String createdTime,@Param(value = "updateTime") String updateTime);
}
