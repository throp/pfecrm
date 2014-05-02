/**
 * Copyright - Property of PFE Corportation
 */
package com.pfecorp.crm.controller;

import static com.pfecorp.crm.infrastructure.SessionMaster.getSession;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pfecorp.crm.domain.Customer;

/**
 * @author Ben Northrop
 */
@Controller
public class CustomerController {

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/customer", produces = "application/json")
	public @ResponseBody
	List<Customer> customer(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		return (List<Customer>) getSession().createQuery("from Customer")
				.list();
	}

}
