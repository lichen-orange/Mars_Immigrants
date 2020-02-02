package com.mars.marsimmigrants.mapper;

import com.mars.marsimmigrants.model.entity.News;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * @author 李陈
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.mapper
 * @date 2020/1/28 00:23 星期二
 */
public interface NewsOptionsDao {
    /*
    查询所有通过的新闻
     */
    List<News> selectNewsOp();

    /**
     * 申请撤回相应id的新闻
     * @param news_id
     * @return
     */
    int updateNewsOpDelete(@Param("news_id")int news_id);

    /**
     * 申请修改相应id的新闻
     * @param news_id
     * @return
     */
    int updateNewsOpUp(@Param("news_id")int news_id);

    /**
     * 将相应id的新闻的操作状态置0（复原）
     * @param news_id
     * @return
     */
    int updateNewsOp(@Param("news_id")int news_id);

    /**
     * 模糊查询
     * @param news_title
     * @param news_content
     * @return
     */
    List<News> selectNewsByTitleOrContent(@Param("news_title")String news_title,@Param("news_content")String news_content);

    /**
     * 通过id查询新闻
     * @param news_id
     * @return
     */
    News selectNewsOpById(@Param("news_id")int news_id);
    /**
     * 修改新闻
     * @param news_id
     * @param news_title
     * @param news_content
     * @return
     */
    int updateNews(@Param("news_id")int news_id,@Param("news_title")String news_title,@Param("news_content")String news_content);
}
