package com.gmail.devi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "forward:html/index.html";
	}
	
	@RequestMapping("/me")
	public String me() {
		//return "forward:html/me.html";
		return "html/me.html";
	}
	
	@RequestMapping("/projects")
	public String projects() {
		//return "forward:html/projects.html";
		return "html/projects.html";
	}

}
