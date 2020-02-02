package com.mars.marsimmigrants.service;

import com.mars.marsimmigrants.model.entity.News;
import com.mars.marsimmigrants.model.vo.PageDto;

import java.util.List;

/**
 * @author 李陈
 * @version V1.0
 * @Project: marsimmigrants
 * @Package com.mars.marsimmigrants.service
 * @date 2020/1/14 16:32 星期二
 */
public interface testService {
    PageDto<News> pdft(Integer pageNo, Integer pageSize);
    int nd_newsCount();
}
