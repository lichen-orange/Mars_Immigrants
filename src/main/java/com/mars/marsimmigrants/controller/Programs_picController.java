package com.mars.marsimmigrants.controller;

import com.mars.marsimmigrants.model.entity.Programs_pic;
import com.mars.marsimmigrants.service.Programs_picService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class Programs_picController {

    @Resource
    private Programs_picService programs_picService;

    @RequestMapping("/Xiangmu")
    public String getAllProgram(HttpServletRequest request){
        List<Programs_pic> list= programs_picService.getAllProgram();
                request.setAttribute("list",list);
                return "Xiangmu";
    }
}
