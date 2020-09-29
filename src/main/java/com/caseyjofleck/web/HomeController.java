package com.caseyjofleck.web;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.caseyjofleck.domain.Accounts;

@Controller
@RequestMapping("/home")      // Map controller to /home
public class HomeController {

	@PersistenceContext
	private EntityManager em;
	
	@RequestMapping(method = RequestMethod.GET)
	public String get() {
		return "home";
	}
}     