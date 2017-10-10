package com.shsxt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/**
 * Created by administer on 2017/10/10.
 */
@Controller
@RequestMapping("welcome")
public class WelcomeController {
    @Value("${application.message}")
    private String message;

    @GetMapping("index")
    @RequestMapping(method = RequestMethod.GET, value = "index")
    public String index(Model model){
        model.addAttribute("message",message);
        model.addAttribute("date",new Date());
        return "welcome";
    }


}
