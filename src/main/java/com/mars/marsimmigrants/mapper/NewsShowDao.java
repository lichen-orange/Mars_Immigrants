package com.mars.marsimmigrants.mapper;

import com.mars.marsimmigrants.model.entity.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 李陈
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.mapper
 * @date 2020/2/1 21:29 星期六
 */
public interface NewsShowDao {
    List<News> selectnNd_news(@Param("index") Integer index, @Param("pageSize") Integer pageSize);
    int nd_newsCount();
}
