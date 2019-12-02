package com.ty.retailerspringmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ty.retailerspringmvc.dto.OrderBean;
import com.ty.retailerspringmvc.dto.Product;
import com.ty.retailerspringmvc.dto.RetailerBean;
import com.ty.retailerspringmvc.service.RetailerService;


@Controller
public class RetailerController {

	@Autowired
	private RetailerService service;

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String login( int id, String password,HttpServletRequest request) {
		RetailerBean bean = service.login(id, password);
		if(bean==null) {
			request.setAttribute("msg", "Retailer not found");
			return "login";
		}else {
			HttpSession session = request.getSession();    
			session.setAttribute("bean", bean);
			return "home";
		}
	}

	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}

	@PostMapping("/register")
	public String register(RetailerBean bean, ModelMap map) {
		int rId = service.register(bean);
		if(rId>0) {
			map.addAttribute("msg", "Registration id is: "+rId);
			return "login";
		}else {
			map.addAttribute("msg", "Registration not succesfull");
			return "register";
		}
	}

	@GetMapping("/home")
	public String homePage(@SessionAttribute(name = "bean", required = false) RetailerBean bean,
			ModelMap map) {
		if(bean==null) {
			map.addAttribute("msg", "You have to Login");
			return "login";
		}else {
			return "home";
		}
	}

	@PostMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/search")
	public String search(ModelMap map, @RequestParam("pId") int pId) {
		Product bean = service.search(pId);
		if(bean!=null) {
			map.addAttribute("bean", bean);
		}else {
			map.addAttribute("msg", "Product not present");
		}
		return "home";
	}
	@GetMapping("/changepassword")
	public String changePassword(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if(session!=null) {
			return "changepassword";
		}else {
			return "login";
		}
	}
	
	@PostMapping("/changepassword")
	public String changePassword(String password, String confirmpassword, 
							@SessionAttribute(name = "bean") RetailerBean bean,
							ModelMap map) {
		if(password.equals(confirmpassword)) {
			service.changePassword(bean.getId(), password);
			map.addAttribute("msg", "password changed succesfully");
		}else {
			map.addAttribute("msg", "Password mismatch, try again");
		}
		return "home";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}





}
