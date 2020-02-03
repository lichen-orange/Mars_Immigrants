package com.mars.marsimmigrants.service;

import com.mars.marsimmigrants.model.entity.News;

import java.util.List;

/**
 * @author 李陈
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.service
 * @date 2020/2/3 17:31 星期一
 */
public interface NewsVService {
    List<News> selectNewsV();

    int updateNewsVDelete(int news_id);
}
