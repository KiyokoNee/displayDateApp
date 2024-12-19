package com.gearing.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.tags.shaded.org.apache.bcel.generic.NEW;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class DisplayDateController {
	
	@GetMapping("")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/date")
	public String date(Model model) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE, MMM dd, YYYY");
		String currentDateString = simpleDateFormat.format(new Date());
		
		model.addAttribute("date", currentDateString);
		return "date.jsp";
	}
	
	@GetMapping("/time")
	public String time(Model model) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm a");
		String currentDateString = simpleDateFormat.format(new Date());
		
		model.addAttribute("time", currentDateString);
		return "time.jsp";
	}
}
