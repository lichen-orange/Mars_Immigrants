package com.mars.marsimmigrants.controller;

import com.alibaba.fastjson.JSON;
import com.mars.marsimmigrants.model.entity.News;
import com.mars.marsimmigrants.service.NewsVerifiedService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author 李陈
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.controller
 * @date 2020/2/3 16:59 星期一
 */
@Controller
public class NewsVerifiedController {
    @Resource
    private NewsVerifiedService newsVerifiedService;
    @RequestMapping("/selectNewsVerified")
    public void selectNewsVerified(HttpServletResponse response){
        List<News> list=newsVerifiedService.selectNewsVerified();
        String result= JSON.toJSONString(list);
        System.out.println(result);
        response.setContentType("text/json; charset=utf-8");
        PrintWriter out;
        try {
            out = response.getWriter();
            out.print(result);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @RequestMapping("/deleteNews")
    public void deleteNews(@RequestParam("news_id")int news_id,HttpServletResponse response){
        int status=newsVerifiedService.updateNewsVerifiedDelete(news_id);
        String result= JSON.toJSONString(status);
        System.out.println(result);
        response.setContentType("text/json; charset=utf-8");
        PrintWriter out;
        try {
            out = response.getWriter();
            out.print(result);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
