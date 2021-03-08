package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
public class HomeController {

	@Autowired
	UserService userSerivce;

	@GetMapping(path = {"/", "/home"})
	public String index(Model model) {

		userSerivce.save(new User("Shaun", 23));

//		userSerivce.findByName("Shaun");
		model.addAttribute("msg", "Welcome");
		return "index";
	}

}