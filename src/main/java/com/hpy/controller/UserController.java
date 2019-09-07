package com.hpy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: hpy
 * Date: 2019-09-07 17:34
 * Description: <描述>
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/test")
    public String test() {
        System.out.println("UserController.test");
        return "success";
    }

}
