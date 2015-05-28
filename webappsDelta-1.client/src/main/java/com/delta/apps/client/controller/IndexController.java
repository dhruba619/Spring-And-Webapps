package com.delta.apps.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author dhrubajyotib
 *
 */
@Controller
@RequestMapping("/v1")
public class IndexController {
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/welcome")
	public String FirstController(ModelMap model){
		model.addAttribute("message","Here comes my new wesite");
		return null;
		
	}

}
