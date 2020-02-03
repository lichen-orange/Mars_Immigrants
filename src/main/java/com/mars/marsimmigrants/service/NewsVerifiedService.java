package com.mars.marsimmigrants.service;

import com.mars.marsimmigrants.model.entity.News;

import java.util.List;

/**
 * @author 李陈
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.service
 * @date 2020/2/3 16:26 星期一
 */
public interface NewsVerifiedService {
    List<News> selectNewsVerified();

    int updateNewsVerifiedDelete(int news_id);
}
