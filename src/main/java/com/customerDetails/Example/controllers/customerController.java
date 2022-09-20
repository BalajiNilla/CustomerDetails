package com.customerDetails.Example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customerDetails.Example.models.customerDetails;
import com.customerDetails.Example.services.customerService;

@RestController
@RequestMapping("api/customer")
public class customerController {
	@Autowired customerService cServ;

	@GetMapping("/getBy/{id}")
	private customerDetails getdetails(@PathVariable Integer id) {
		return cServ.getDetailsbyId(id);
	}
	@GetMapping("/getAll")
	private List<customerDetails> getAlldetails(){
		return cServ.getAllDetails();
	}
	@DeleteMapping("/deleteby/{id}")
	private void delete(@PathVariable Integer id) {
		cServ.deleteById(id);
	}
	@PutMapping("/update/{id}")
	private Optional<customerDetails> update(@RequestBody customerDetails cD,@PathVariable Integer id){
		return cServ.updatingByid(cD, id);
	}
	@PostMapping("/add")
	private List<customerDetails> add(@RequestBody customerDetails cD){
		return cServ.addingNew(cD);
		}
}
/*insert into CUSTOMER_DETAILS values(1,'hyd','one@gamail','one');insert into ACCOUNT_DETAILS values(1,9090,'2022-05-23','savings',1);*/