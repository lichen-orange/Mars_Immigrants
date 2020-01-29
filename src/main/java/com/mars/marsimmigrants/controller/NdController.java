package com.mars.marsimmigrants.controller;

import com.mars.marsimmigrants.service.NdService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
    @RequestMapping("/updatePasd")
    public String updatePasd(String id,String updatePasd){
        if (ndService.update(id,updatePasd)){
            return "/123";//返回用户页
        }else {
            return "/456";//返回修改页面
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
