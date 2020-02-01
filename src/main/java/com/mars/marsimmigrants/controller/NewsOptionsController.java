package com.mars.marsimmigrants.controller;

import com.alibaba.fastjson.JSON;
import com.mars.marsimmigrants.model.entity.News;
import com.mars.marsimmigrants.service.NewsOptionsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
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
 * @date 2020/1/29 21:58 星期三
 */
@Controller
public class NewsOptionsController {

    @Resource
    private NewsOptionsService newsOptionsService;

    @PostMapping("/selectNewsOp")
    public void selectNewsOp(HttpServletResponse response){
        List<News> list=newsOptionsService.selectNewsOp();
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
    @PostMapping("selectNewsByTitleOrContent")
    public void selectNewsByTitleOrContent(@RequestParam("news_title")String news_title,HttpServletResponse response){
        List<News> list=newsOptionsService.selectNewsByTitleOrContent(news_title);
        String result= JSON.toJSONString(list);
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

    @PostMapping("selectNewsOpById")
    public void selectNewsOpById(@RequestParam("news_id")int news_id,HttpServletResponse response){
        News n=newsOptionsService.selectNewsOpById(news_id);
        String result= JSON.toJSONString(n);
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
    @PostMapping("updateNews")
    public void updateNews(@RequestParam("news_id")int news_id,@RequestParam("news_title")String news_title,@RequestParam("news_content")String news_content,HttpServletResponse response){
        int status=newsOptionsService.updateNews(news_id,news_title,news_content);
        if (status>0){
            String result= JSON.toJSONString(true);
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
        }else {
            String result= JSON.toJSONString(false);
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
    @PostMapping("updateNewsOpDelete")
    public void updateNewsOpDelete(@RequestParam("news_id")int news_id,HttpServletResponse response){
        int stutas=newsOptionsService.updateNewsOpDelete(news_id);
        if (stutas>0){
            String result= JSON.toJSONString(true);
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
        }else {
            String result= JSON.toJSONString(false);
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
    @PostMapping("updateNewsOpUp")
    public void updateNewsOpUp(@RequestParam("news_id")int news_id,HttpServletResponse response){
        int stutas=newsOptionsService.updateNewsOpUp(news_id);
        if (stutas>0){
            String result= JSON.toJSONString(true);
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
        }else {
            String result= JSON.toJSONString(false);
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

    @PostMapping("updateNewsOp")
    public void updateNewsOp(@RequestParam("news_id")int news_id,HttpServletResponse response){
        int stutas=newsOptionsService.updateNewsOp(news_id);
        if (stutas>0){
            String result= JSON.toJSONString(true);
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
        }else {
            String result= JSON.toJSONString(false);
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
}
