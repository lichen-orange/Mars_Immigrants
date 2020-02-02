package com.mars.marsimmigrants.controller;

import com.alibaba.fastjson.JSON;
import com.mars.marsimmigrants.service.NdService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.controller
 * @author杨帆
 * @date 2020/1/28 13:30 星期二
 */
@Controller
public class NdController {
    @Resource
    private NdService ndService;

    //模糊查询
    @RequestMapping("/content")
    public String getList(String content, HttpServletRequest request){
        request.setAttribute("list",ndService.getUniteList(content));
        return "/123";//返回用户页
    }

    //修改密码
    @RequestMapping("updatePasd")
    public void updatePasd(String password, HttpServletResponse response) throws IOException {
        System.out.println(password);
        //通过 redis 拿到 用户的id
        //模拟id 1
        String id = "1";
        if (ndService.update(id,password)){
            System.out.println("修改成功");
            String resultStr = JSON.toJSONString("1");
            response.setContentType("text/html");
            PrintWriter writer = response.getWriter();
            writer.write(resultStr);
            writer.flush();
            writer.close();
        }else {
            System.out.println("修改失败");
            String resultStr = JSON.toJSONString("0");
            response.setContentType("text/html");
            PrintWriter writer = response.getWriter();
            writer.write(resultStr);
            writer.flush();
            writer.close();
        }
    }

    //上传项目
    @RequestMapping("/insertItems")
    public String insertItems(String title,String content,String comment){
        if (ndService.items(title,content,comment)){
            return "ImgInto";//进入图片页面
        }else {
            return "ItemsInto";
        }
    }

    //上传图片
    @RequestMapping("/insertImg")
    public String insertImg(String programs_pic_address){
        if (ndService.img(programs_pic_address)){
            return "";//返回后台首页
        }else {
            return "ItemsInto";//返回添加页面
        }
    }

    @RequestMapping("/img")
    public String img(int id,HttpServletRequest request){
        request.setAttribute("id",id);
        return "PasswdUp";
    }

}
