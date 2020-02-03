package com.mars.marsimmigrants.controller;

import com.alibaba.fastjson.JSON;
import com.mars.marsimmigrants.model.entity.News;
import com.mars.marsimmigrants.model.vo.PageDto;
import com.mars.marsimmigrants.service.testService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 李陈
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.controller
 * @date 2020/1/14 17:05 星期二
 */
@Controller
public class testController {

    @Resource
    private testService ts;

    @RequestMapping("/showAllnews")
    public void showAllnews(HttpServletResponse response, @RequestParam(name="pageNo",required =false,defaultValue = "1")Integer pageNo,
                              @RequestParam(name="pageSize",required =false,defaultValue = "2" )Integer pageSize, Model model){
        PageDto<News> newsPageDto=ts.pdft(pageNo, 10);
        if (pageNo>1){
            newsPageDto.setHasPreviousPage(true);
        }else{
            newsPageDto.setHasPreviousPage(false);
        }
        Integer pagess=newsPageDto.getPages();
        long count=newsPageDto.getTotal();
        if (pageNo>=pagess){
            newsPageDto.setHasNextPage(false);
        }else{
            newsPageDto.setHasNextPage(true);
        }
        model.addAttribute("maxCount",pagess);
        model.addAttribute("count",count);
        model.addAttribute("pageNo",pageNo);
        model.addAttribute("newsPageDto",newsPageDto);
        Map<String,Object> map=new HashMap<>();
        map.put("maxCount",pagess);
        map.put("count",count);
        map.put("pageNo",pageNo);
        map.put("newsList",newsPageDto.getData());
        String result= JSON.toJSONString(map);
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
        //return"main";
    }
}
