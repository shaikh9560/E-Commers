package com.Model.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Bean.Customer;
import com.Model.Exception.Customer_Exception;
import com.Model.Service.Customer_Service;

@RestController
public class Customer_controller {
	
	@Autowired
	private Customer_Service customer_Service;
	
	
	@PostMapping("/RegisterCustomer")
	    public ResponseEntity<Customer> ResgisteCustomer(@RequestBody Customer adms)throws Customer_Exception{
		
		Customer add = customer_Service.RegisterCustomer(adms);
		
		return new ResponseEntity<Customer>(add,HttpStatus.ACCEPTED);
}
}
