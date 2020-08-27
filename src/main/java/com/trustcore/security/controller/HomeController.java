package com.trustcore.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trustcore.security.dto.LoginUserDTO;

@Controller
@RequestMapping(value="/")
public class HomeController {
	@RequestMapping(value="/admin/index.htm", method=RequestMethod.GET)  
    public String home() {  
        return "home";  
    }
	@RequestMapping(value="/manager/manager.htm", method=RequestMethod.GET)  
    public String admin() {  
        return "admin";  
    }  
	
	
	
}
