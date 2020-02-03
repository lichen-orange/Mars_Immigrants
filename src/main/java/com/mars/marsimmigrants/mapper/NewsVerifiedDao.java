package com.mars.marsimmigrants.mapper;

import com.mars.marsimmigrants.model.entity.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 李陈
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.mapper
 * @date 2020/2/3 16:23 星期一
 */
public interface NewsVerifiedDao {
    List<News> selectNewsVerified();

    int updateNewsVerifiedDelete(@Param("news_id")int news_id);
}
