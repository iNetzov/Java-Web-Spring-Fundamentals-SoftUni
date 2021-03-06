package com.example.demo.web;

import com.example.demo.utils.CurrentUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final CurrentUser currentUser;

    public HomeController(CurrentUser currentUser) {
        this.currentUser = currentUser;
    }


    @GetMapping("/")
    public String index(){
        if (currentUser.getId() == null){
            return "index";
        }
        return "home";
    }
}
