package com.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.di.app.models.service.MyService;

@Controller
public class IndexController {
	
	@Autowired
	private MyService service;
	
	@GetMapping({"/", "", "index"})
	public String index(Model model) {
		model.addAttribute("Obj1", service.operation());
		return "index";
	}
}
