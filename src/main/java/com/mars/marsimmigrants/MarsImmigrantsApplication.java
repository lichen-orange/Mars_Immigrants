package com.mars.marsimmigrants;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan(basePackages = "com.mars.marsimmigrants.mapper")
@MapperScan(basePackages = "com.mars.marsimmigrants.dao")
@EnableSwagger2
@EnableTransactionManagement
public class MarsImmigrantsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarsImmigrantsApplication.class, args);
    }

}
