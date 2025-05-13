package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class pageController {
    //handling requests

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page handler");
        model.addAttribute("name", "Substring Technology");
        model.addAttribute("youtubeChannel", "Akiracodes");
        model.addAttribute("githubRepo", "https://github.com/juikalan21/");

        return "home";
    }
}
