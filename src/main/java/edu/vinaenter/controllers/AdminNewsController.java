package edu.vinaenter.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.vinaenter.models.News;
import edu.vinaenter.service.NewsService;

@Controller
@RequestMapping("admin")
public class AdminNewsController {
	
	@Autowired //DI
	private NewsService newsService;
	
	@GetMapping("index")
	public String index(ModelMap model) {
		List<News> newsList = newsService.getList();
		model.addAttribute("newsList", newsList);
		return "admin/index";
	}
	
	@GetMapping(value="add")
	public String add() {
		return "admin/add";
	}
}
