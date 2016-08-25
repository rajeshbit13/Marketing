package com.mk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mk.model.User;


@Controller
public class HomeController {
	@RequestMapping(value="/home")
	public ModelAndView showHome() {
		return new ModelAndView("home","command",new User());
	}
	@RequestMapping(value="/product")
	public ModelAndView showBlog() {
		return new ModelAndView("product");
	}
	@RequestMapping(value="/contacts")
	public ModelAndView showContacts() {
		return new ModelAndView("contacts");
	}
	@RequestMapping(value="/about")
	public ModelAndView showAbout() {
		return new ModelAndView("about");
	}
	@RequestMapping(value="/services")
	public ModelAndView showServices() {
		return new ModelAndView("services");
	}
	@RequestMapping(value="/login")
	public ModelAndView showLogin() {
		return new ModelAndView("login");
	}
	@RequestMapping(value="/mission")
	public ModelAndView showMission() {
		return new ModelAndView("Mission");
	}
	@RequestMapping(value="/vision")
	public ModelAndView showVision() {
		return new ModelAndView("vision");
	}
}
