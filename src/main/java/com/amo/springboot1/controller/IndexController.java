package com.amo.springboot1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName:IndexController
 * @data:2021/7/25 下午4:45
 * @author:amo
 */
@Controller
public class IndexController {
    private Logger logger =LoggerFactory.getLogger(this.getClass());

    //index页面查看项目是否能正常启动
    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "hello world!!";
    }

    @RequestMapping("login")
    public String tologin(){
        logger.info("定向登录页");
        return "login";
    }
}
