package com.trustcore.security.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trustcore.security.dto.LoginUserDTO;
import com.trustcore.security.service.IUserService;

@Controller
public class UserController {
	@Autowired
	IUserService userInfoService;
	
	@RequestMapping(value="/register.htm",method=RequestMethod.GET)
	public String register(Model model){
		model.addAttribute("userDTO", new LoginUserDTO());
		model.addAttribute("roleList",userInfoService.getUserRoles());
		return "userRegister";
	}
	@RequestMapping(value="/register.htm",method=RequestMethod.POST)
	public String postRegister(@ModelAttribute(value="userDTO")LoginUserDTO userDTO ){
		userInfoService.saveUser(userDTO);
		return "redirect:/login.htm";
	}
	@RequestMapping(value="/login.htm")
	public String login(Model model){
		return "login";
	}
	@RequestMapping(value="/403.htm")
	public String accessDenied(Model model){
		return "accessDenied";
	}
	 @RequestMapping(value="/logout.htm", method=RequestMethod.GET)  
	    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {  
	        Authentication auth = SecurityContextHolder.getContext().getAuthentication();  
	        if (auth != null){      
	           new SecurityContextLogoutHandler().logout(request, response, auth);  
	        }  
	         return "redirect:/login.htm";  
	     } 
	 @RequestMapping(value="/index.htm")
	 public String index(){
			return "index";
		}
}
