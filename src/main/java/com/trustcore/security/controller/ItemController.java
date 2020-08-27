package com.trustcore.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {

	@RequestMapping(value="/item/list.htm")
	public String index(Model model) {
		return "items/index";
	}
	@RequestMapping(value="/item/edit.htm")
	public String edit(Model model) {
		return "items/edit";
	}
}
