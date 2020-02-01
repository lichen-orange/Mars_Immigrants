package com.mars.marsimmigrants.service;

import com.mars.marsimmigrants.model.entity.NdUsers;
import org.apache.ibatis.annotations.Param;

public interface ImmigrationLoginService {
    String login(@Param("user_phone") String user_phone, @Param("user_password") String user_password);
}
