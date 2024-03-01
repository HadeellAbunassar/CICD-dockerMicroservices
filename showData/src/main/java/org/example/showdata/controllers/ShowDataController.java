package org.example.showdata.controllers;

import org.example.showdata.dao.StatisticsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/retrieveData")
public class ShowDataController {

    @Autowired
    StatisticsDAO statisticsDAO;


    @GetMapping
    public String showData(Model model) {
        model.addAttribute("statisticsList", statisticsDAO.findAll());
        return "showData";
    }





}
