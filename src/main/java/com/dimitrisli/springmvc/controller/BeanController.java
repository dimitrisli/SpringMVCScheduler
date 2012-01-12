package com.dimitrisli.springmvc.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/welcome")
@Controller
public class BeanController {

	protected static Logger logger = Logger.getLogger(BeanController.class);
	
    @RequestMapping(method = RequestMethod.GET)
    public String requestMethod() {
    	logger.debug("Received request now passing to the view");
    	return "welcome";
	}
   
}
