package com.thanhdc.example.controller;

import com.thanhdc.example.Model.Staff;
import com.thanhdc.example.Service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.awt.print.Pageable;

@Controller
@RequestMapping("/")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @GetMapping("/")
    public ModelAndView showIndex(Pageable pageable) {
        Page<Staff> staffs = staffService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("show");
        modelAndView.addObject("staff", staffs);
        return modelAndView;
    }
}

