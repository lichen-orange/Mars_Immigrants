package com.mars.marsimmigrants.service;

import com.mars.marsimmigrants.model.entity.NdUnite;

import java.util.List;

/**
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.service
 * @author杨帆
 * @date 2020/1/28 12:22 星期二
 */
public interface NdService {
    List<NdUnite> getUniteList(String content);

    boolean update(String id, String updatePasd);

    boolean items(String title, String content, String comment);

    boolean img(String programs_pic_address);
}
