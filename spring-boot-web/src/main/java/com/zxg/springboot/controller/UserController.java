package com.zxg.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangxiaoguang
 * @createtime 2019/10/15-14:56
 */
@RestController
public class UserController {
    @RequestMapping("/getUser")
    public String getUser(){
        return "user";
    }
}
