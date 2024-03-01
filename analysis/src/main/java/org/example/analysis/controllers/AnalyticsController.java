package org.example.analysis.controllers;

import org.example.analysis.dao.RetirveDataDAO;
import org.example.analysis.dao.StatisticsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ana")
public class AnalyticsController {

    @Autowired
    RetirveDataDAO retirveDataDAO;

    @Autowired
    StatisticsDAO statisticsDAO;

    @GetMapping("/getstat")
    public ResponseEntity<String> analyze() {
        System.out.println("modification for ci/cd test");
        List<Integer> grades = retirveDataDAO.getAllGrades();
        statisticsDAO.calculateStatistics(grades);
        return ResponseEntity.status(HttpStatus.OK).body("Inserting The Grade Done Successfully.");
    }
}
