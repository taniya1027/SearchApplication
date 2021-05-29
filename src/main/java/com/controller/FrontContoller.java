package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
//import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class FrontContoller {
	
	@RequestMapping("/search")
	public String Search()
	{
		return "Search";
		
	}
	
	@RequestMapping(value = "/SearchPage" ,method= RequestMethod.POST)
	public RedirectView SearchResult(@RequestParam("search") String query)
	{
		RedirectView rv = new RedirectView();
		String url = "https://www.google.com/search?q="+query;
		
		rv.setUrl(url);
		return rv;
	}
	
}