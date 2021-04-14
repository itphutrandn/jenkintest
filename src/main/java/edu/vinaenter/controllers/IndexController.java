package edu.vinaenter.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.vinaenter.models.News;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/hello01", method = RequestMethod.GET)
	public String index(Model  model) {
		String username = "PhuT";
		String fullName = "Phu Tran";
		// set variable
		model.addAttribute("username", username);
		model.addAttribute("fullName", fullName);
		// set object
		News news =  new News();
		news.setId(1);
		news.setTitle("Qúy trúng số độc đắc ngày hôm nay"+
		new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		model.addAttribute("news",news);
		return "index";
	}
}
