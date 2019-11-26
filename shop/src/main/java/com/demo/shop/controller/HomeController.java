package com.demo.shop.controller;

import com.demo.shop.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    // MVC ( model view controller)
    @GetMapping("serkan")
    public String indexPage(){
        return  "index";
        // GET / POST
    }
    @GetMapping("test")
    public String test(){
        return  "test";
    }
    @GetMapping("register")
    public  String register(ModelMap map){
        User user = new User();
        user.setEmail("serkan@gmail.com");
        user.setName("Serkan");
        map.addAttribute("user",user);
        map.addAttribute("message","Hello World");
        return "register";
    }
}
