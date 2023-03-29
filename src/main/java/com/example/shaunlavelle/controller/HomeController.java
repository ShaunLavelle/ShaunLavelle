package com.example.shaunlavelle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	public String index(Model model) {
		model.addAttribute("msg", "Welcome");
		return "index";
	}

	@GetMapping("/testVue")
	@ResponseBody
	public String getTestVue() {
		return "test vue data";
	}

}