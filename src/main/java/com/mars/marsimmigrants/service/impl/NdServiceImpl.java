package com.mars.marsimmigrants.service.impl;

import com.mars.marsimmigrants.mapper.NdOptionsDao;
import com.mars.marsimmigrants.model.entity.NdNews;
import com.mars.marsimmigrants.model.entity.NdPrograms;
import com.mars.marsimmigrants.model.entity.NdUnite;
import com.mars.marsimmigrants.service.NdService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.service.impl
 * @author杨帆
 * @date 2020/1/28 12:23 星期二
 */
@Service
public class NdServiceImpl implements NdService {
    @Resource
    private NdOptionsDao optionsDao;

    @Override
    public List<NdUnite> getUniteList(String content) {
        List<NdUnite> list = new ArrayList<NdUnite>();

        //新闻查询
        List<NdNews> newsList = optionsDao.getNewsList(content);

        //项目查询
        List<NdPrograms> programsList = optionsDao.getProgramsList(content);

        NdUnite ndUnite1 = null;
        NdUnite ndUnite2 = null;

        for (NdNews news : newsList){
            ndUnite1 = new NdUnite(news.getNews_id(),news.getNews_title(),news.getNews_content());
            list.add(ndUnite1);
        }
        for (NdPrograms programs : programsList){
            ndUnite2 = new NdUnite(programs.getProgram_id(),programs.getProgram_title(),programs.getProgram_content());
            list.add(ndUnite2);
        }

        return list;
    }

    @Override
    public boolean update(String id, String updatePasd) {
        int i = 0;
        if (optionsDao.update(id,updatePasd) > 0){
            return true;
        }
        return false;
    }
    //上传项目
    @Override
    public boolean items(String title, String content, String comment) {
        int i = 0;
        if (optionsDao.items(title,content,comment) > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean img(String programs_pic_address) {
        int i = 0;
        if (optionsDao.img(programs_pic_address) > 0){
            return true;
        }
        return false;
    }
}
