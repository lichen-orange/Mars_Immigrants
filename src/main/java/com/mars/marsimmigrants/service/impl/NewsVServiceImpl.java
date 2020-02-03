package com.mars.marsimmigrants.service.impl;

import com.mars.marsimmigrants.mapper.NewsVDao;
import com.mars.marsimmigrants.model.entity.News;
import com.mars.marsimmigrants.service.NewsVService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李陈
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.service.impl
 * @date 2020/2/3 17:32 星期一
 */
@Service
public class NewsVServiceImpl implements NewsVService {
    @Resource
    private NewsVDao newsVDao;

    @Override
    public List<News> selectNewsV() {
        List<News> list=newsVDao.selectNewsV();
        return list;
    }

    @Override
    public int updateNewsVDelete(int news_id) {
        int status=newsVDao.updateNewsVDelete(news_id);
        return 0;
    }
}
