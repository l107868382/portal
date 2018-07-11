package com.code.portal.system.user.controller;


import com.code.portal.system.user.model.User;
import com.code.portal.system.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @PostMapping("/doLogin")
    public String doLogin(HttpServletRequest request, User user){
        User dbuser = userService.doLogin(user);
        request.setAttribute("dbuser",dbuser);
        if (dbuser!=null){
            return "success";
        }else{
            return "index";
        }
    }
}
