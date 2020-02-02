package com.mars.marsimmigrants.service.impl;

import com.mars.marsimmigrants.mapper.ImmigrationLogin;
import com.mars.marsimmigrants.model.entity.NdUsers;
import com.mars.marsimmigrants.service.ImmigrationLoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ImmigrationLoginServiceImpl implements ImmigrationLoginService {
    @Resource
    private ImmigrationLogin login;
    @Override
    public String login(String user_phone, String user_password) {
        return login.login(user_phone, user_password);
    }
}
