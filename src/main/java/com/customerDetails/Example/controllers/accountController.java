package com.customerDetails.Example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customerDetails.Example.models.Accounts;
import com.customerDetails.Example.services.accountService;

@RestController
@RequestMapping("api/account")
public class accountController {
@Autowired accountService aServ;

@GetMapping("/getcustomers/{type}")
private List<String> getcus(@PathVariable String type){
	return aServ.filterCustomers(type);
	
}
@GetMapping("/get/{id}")
public Accounts getAccouts(@PathVariable Integer id) {
	return aServ.get(id);
}
}
