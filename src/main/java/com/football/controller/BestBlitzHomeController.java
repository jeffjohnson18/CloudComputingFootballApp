package com.football.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BestBlitzHomeController {

    @GetMapping("/bestblitzhome")
    public String display(Model model){
        return "BestBlitzHome";
    }
}