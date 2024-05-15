package com.api.book.springboot_restbook.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppErrorController implements ErrorController {


	    @RequestMapping("/error")
	
	    public String getErrorPath() {
	        // TODO Auto-generated method stub
	        return "error";
	    }
}
