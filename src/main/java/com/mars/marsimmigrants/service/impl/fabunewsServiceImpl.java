package com.mars.marsimmigrants.service.impl;

import com.mars.marsimmigrants.mapper.fabunews;
import com.mars.marsimmigrants.service.fabunewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 韩帅龙
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.service.impl
 * @date 2020/1/29 11:23 星期三
 */
@Service
public class fabunewsServiceImpl implements fabunewsService {
    @Resource
    private fabunews dao;
    @Override
    public int addnews(String title, String Content, String owner, String createdTime, String updateTime) {
        int addnews = dao.addnews(title, Content, owner, createdTime, updateTime);

        return addnews;
    }
}
