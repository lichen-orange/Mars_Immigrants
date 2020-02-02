package com.mars.marsimmigrants.service.impl;

import com.mars.marsimmigrants.dao.Programs_picDao;
import com.mars.marsimmigrants.model.entity.Programs_pic;
import com.mars.marsimmigrants.service.Programs_picService;
import org.springframework.stereotype.Service;
/**
 * @author 张圆豪
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.controller
 * @date 2020/1/14 17:05 星期二
 */
import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class Programs_picServiceImpl implements Programs_picService {

    @Resource
    private Programs_picDao programs_picDao;
    @Override
    public ArrayList<Programs_pic> getAllProgram() {
        return programs_picDao.getAllPrograms();
    }
}
