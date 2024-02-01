package com.football.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.football.Repository.QuarterbackRepository;
import com.football.entity.Quarterbacks;

@Controller
@RequestMapping("/")
public class QuarterbackController {

    @Autowired
    private QuarterbackRepository quarterbackRepository;

    @GetMapping("/quarterbacks")
    public String display(Model model){
        List<Quarterbacks> quarterbacks = (List<Quarterbacks>) quarterbackRepository.findAll();
        model.addAttribute("quarterbacks", quarterbacks);
        return "Quarterbacks";
    }
}
