package com.mk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mk.model.User;

@Controller
public class LoginController {
	@RequestMapping(value="/registrator")
	public ModelAndView userRegistrator(@ModelAttribute("command")User user) {
		return new ModelAndView("success","msg",user.getFirstName());
	}
	@RequestMapping(value="/loginvalidate")
	public ModelAndView validateLogin(@ModelAttribute("command")User user) {
		return new ModelAndView("succes");
	}
}
