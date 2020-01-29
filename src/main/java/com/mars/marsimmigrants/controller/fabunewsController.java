package com.mars.marsimmigrants.controller;

import com.alibaba.fastjson.JSON;
import com.mars.marsimmigrants.service.fabunewsService;
import com.mars.marsimmigrants.utils.qiniu.QNUtil;
import com.mars.marsimmigrants.utils.redis.RedisUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 韩帅龙
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.controller
 * @date 2020/1/29 11:25 星期三
 */
@Controller
public class fabunewsController {
    @Resource
    private fabunewsService service;
    @Resource
    private RedisUtil redis;
    @Resource
    private QNUtil qnUtil;

    @RequestMapping("addnews")
    public void addnews(String title , String Content, HttpServletResponse response) throws IOException {
       // System.out.println(title +" "+Content);
        //redis 获取登录用户的 id
        //redis.get("user")
        //模拟用户id
        String owner = "1";
        //获取当前时间 当作创建时间和修改时间
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        String createdTime = simpleDateFormat.format(date);
        String updateTime=simpleDateFormat.format(date);

        int addnews = service.addnews(title, Content, owner, createdTime, updateTime);
        if (addnews > 0){
            System.out.println("新闻添加成功");
            String resultStr = JSON.toJSONString("1");
            response.setContentType("text/html");
            PrintWriter writer = response.getWriter();
            writer.write(resultStr);
            writer.flush();
            writer.close();
        }else{
            System.out.println("添加失败");
            String resultStr = JSON.toJSONString("0");
            response.setContentType("text/html");
            PrintWriter writer = response.getWriter();
            writer.write(resultStr);
            writer.flush();
            writer.close();
        }


    }


    @RequestMapping("addnewspic")
    @ResponseBody
    public String addnewspic(@RequestParam("file") MultipartFile file) throws IOException {
        //方案一：找到id++ 然后把图片放入七牛云 图片地址放入数据库
        //方案er: 直接把图片放入七牛云
       //System.out.println("终于进来方法了");
       String fileName =new Date().getTime()+"newspic";
        //System.out.println(fileName);

        String dizhi = qnUtil.fileUpload(file.getInputStream(), fileName);
       // System.out.println(dizhi);

        Map<String,Object> map = new HashMap<String, Object>();
        Map<String,Object> map2 = new HashMap<String, Object>();
        map2.put("src",dizhi);//图片url
        map2.put("title","title");//图片名称，这个会显示在输入框
        map.put("code",0);
        map.put("msg","上传成功");//提示消息
        map.put("data",map2);

        String result = JSON.toJSONString(map);
        return result;
    }


}
