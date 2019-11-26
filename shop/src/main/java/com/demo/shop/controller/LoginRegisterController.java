package com.demo.shop.controller;

import com.demo.shop.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class LoginRegisterController {
    // spring boot(java web-tyhmleaf(Template Engine))
    @PostMapping("register")// /auth/register
    public String register(@ModelAttribute("user") User user){

        return "";
    }
}
