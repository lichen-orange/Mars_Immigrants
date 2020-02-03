package com.mars.marsimmigrants.controller;

import com.mars.marsimmigrants.model.entity.NdUsers;
import com.mars.marsimmigrants.service.ImmigrationLoginService;
import com.mars.marsimmigrants.utils.MD5.MD5;
import com.mars.marsimmigrants.utils.redis.RedisUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class ClientLoginController {
    @Resource
    private RedisUtil redisUtil;
    @Resource
    private ImmigrationLoginService login;
    @RequestMapping("tologin")
    public String tologin(){
        return "/login.html";
    }
    @RequestMapping("login")
    public String login(String user_phone, String user_password, HttpSession session, Model model){
        String ndUsers=login.login(user_phone,user_password);
        System.out.println(user_password+" "+user_phone);
        System.out.println(ndUsers);
        if(null!=ndUsers){
            String s= MD5.getMD5(ndUsers,8);
            session.setAttribute("token",s);
            redisUtil.set(s,ndUsers);
            System.out.println("登陆成功");
            return "/newsshow.html";
        }
        System.out.println("登陆失败");
        return "/login.html";
    }
}
