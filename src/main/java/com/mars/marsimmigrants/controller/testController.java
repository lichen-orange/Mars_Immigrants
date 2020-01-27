package com.mars.marsimmigrants.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 李陈
 * @version V1.0
 * @Project: mars_immigrants
 * @Package com.mars.marsimmigrants.controller
 * @date 2020/1/14 17:05 星期二
 */
@Controller
public class testController {
 @RequestMapping("/t")
 //@ResponseBody
    public String test(){
     return "/test.html";
 }
}
