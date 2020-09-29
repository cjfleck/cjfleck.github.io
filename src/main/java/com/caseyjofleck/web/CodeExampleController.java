package com.caseyjofleck.web;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.caseyjofleck.domain.Address;

@Controller
@SessionAttributes("session")
@RequestMapping("/code_example")      // Map controller to /codeexample
public class CodeExampleController {

	@PersistenceContext
	private EntityManager em;
	
	@RequestMapping(method = RequestMethod.GET)
	public String get() {  
		return "code_example";
	}
	
	@RequestMapping(value="/address_table", method = RequestMethod.GET)
	public @ResponseBody List<Address> getAddressTable() {
		List<Address> addresses = em.createQuery("SELECT a FROM Address a", Address.class).getResultList();
		return addresses;
	}
	
}
