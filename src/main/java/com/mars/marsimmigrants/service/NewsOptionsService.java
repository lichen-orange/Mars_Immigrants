package com.mars.marsimmigrants.service;

import com.mars.marsimmigrants.model.entity.News;

import java.util.List;

/**
 * @author 李陈
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.service
 * @date 2020/1/28 17:50 星期二
 */
public interface NewsOptionsService {
    /*
  查询所有通过的新闻
   */
    List<News> selectNewsOp();

    /**
     * 申请撤回相应id的新闻
     * @param news_id
     * @return
     */
    int updateNewsOpDelete(int news_id);

    /**
     * 申请修改相应id的新闻
     * @param news_id
     * @return
     */
    int updateNewsOpUp(int news_id);

    /**
     * 将相应id的新闻的操作状态置0（复原）
     * @param news_id
     * @return
     */
    int updateNewsOp(int news_id);

    News selectNewsOpById(int news_id);

    List<News> selectNewsByTitleOrContent(String news_title);

    int updateNews(int news_id,String news_title,String news_content);
}
