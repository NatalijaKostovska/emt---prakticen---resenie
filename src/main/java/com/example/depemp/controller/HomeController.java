package com.example.depemp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
@RequestMapping("/home")

public class HomeController {
    @GetMapping
    public String getHomePage(HttpServletResponse res, HttpServletRequest req) {
        return "departments";
    }

}
