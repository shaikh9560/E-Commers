package com.Model.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Bean.AdminDTO;
import com.Model.Bean.CustomerDTO;
import com.Model.Exception.AdminException;
import com.Model.Exception.Customer_Exception;
import com.Model.Service.Customer_Login;

@RestController
public class CustomerLoginController {
	
	@Autowired
	Customer_Login customer_Login;
	
	
	@PostMapping("/CustomerLogin")
	public ResponseEntity<String> LoginAdmin(@Valid @RequestBody CustomerDTO admin  )throws  Customer_Exception{
		
		String res = customer_Login.CustomerLofin(admin);
		
		return new ResponseEntity<>(res,HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("/CustomerLogout")
	public ResponseEntity<String> LogoutAdmin(@RequestParam("key") String key )throws  Customer_Exception{
		
		String res = customer_Login.CustomerLogout(key);
		
		return new ResponseEntity<String>(res,HttpStatus.ACCEPTED);
		
	}

}
