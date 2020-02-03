package com.mars.marsimmigrants.service.impl;

import com.mars.marsimmigrants.mapper.NewsVerifiedDao;
import com.mars.marsimmigrants.model.entity.News;
import com.mars.marsimmigrants.service.NewsVerifiedService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李陈
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.service.impl
 * @date 2020/2/3 16:55 星期一
 */
@Service
public class NewsVerifiedServiceImpl implements NewsVerifiedService {
    @Resource
    private NewsVerifiedDao newsVerifiedDao;



    @Override
    public List<News> selectNewsVerified() {
        List<News> list=newsVerifiedDao.selectNewsVerified();
        return list;
    }

    @Override
    public int updateNewsVerifiedDelete(int news_id) {
        int status=newsVerifiedDao.updateNewsVerifiedDelete(news_id);
        return 0;
    }
}
