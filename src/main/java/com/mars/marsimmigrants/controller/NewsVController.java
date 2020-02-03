package com.mars.marsimmigrants.controller;

import com.alibaba.fastjson.JSON;
import com.mars.marsimmigrants.model.entity.News;
import com.mars.marsimmigrants.service.NewsVService;
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
 * @date 2020/2/3 17:35 星期一
 */
@Controller
public class NewsVController {
    @Resource
    private NewsVService newsVService;
    @RequestMapping("/selectNewsV")
    public void selectNewsV(HttpServletResponse response){
        List<News> list=newsVService.selectNewsV();
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

    @RequestMapping("/NewsChehui")
    public void deleteNews(@RequestParam("news_id")int news_id,HttpServletResponse response){
        int status=newsVService.updateNewsVDelete(news_id);
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
