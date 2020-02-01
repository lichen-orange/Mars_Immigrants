package com.mars.marsimmigrants.service.impl;

import com.mars.marsimmigrants.mapper.NewsOptionsDao;

import com.mars.marsimmigrants.model.entity.News;
import com.mars.marsimmigrants.service.NewsOptionsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李陈
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.service.serviceimpl
 * @date 2020/1/28 18:02 星期二
 */
@Service
public class NewsOptionsServiceImpl implements NewsOptionsService {
    @Resource
    private NewsOptionsDao newsOptionsDao;
    @Override
    public List<News> selectNewsOp(){
        List<News> list=newsOptionsDao.selectNewsOp();
        System.out.println(list.toString());
        return list;
    }
    @Override
    public int updateNewsOpDelete(int news_id){
        int status=newsOptionsDao.updateNewsOpDelete(news_id);
        if(status>0){
            return 1;
        }
        return -1;
    }
    @Override
    public int updateNewsOpUp(int news_id){
        int status=newsOptionsDao.updateNewsOpUp(news_id);
        if(status>0){
            return 1;
        }
        return -1;
    }
    @Override
    public int updateNewsOp(int news_id){
        int status=newsOptionsDao.updateNewsOp(news_id);
        if(status>0){
            return 1;
        }
        return -1;
    }
    @Override
    public List<News>  selectNewsByTitleOrContent(String news_title){
        List<News> list=newsOptionsDao.selectNewsByTitleOrContent(news_title,news_title);
        return list;
    }
    @Override
    public int updateNews(int news_id,String news_title,String news_content){
       int status= newsOptionsDao.updateNews(news_id,news_title,news_content);
        if(status>0){
            return 1;
        }
        return -1;
    }

    @Override
    public News selectNewsOpById(int news_id){
       News n= newsOptionsDao.selectNewsOpById(news_id);
       return n;
    }
}
