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
import com.Model.Exception.AdminException;
import com.Model.Service.LoginService;

@RestController
public class LoginController {
	
	
	@Autowired
	LoginService loginService;
	
	
	@PostMapping("/adminlogin")
	public ResponseEntity<String> LoginAdmin(@Valid @RequestBody AdminDTO admin  )throws AdminException{
		
		String res = loginService.loginAdmin(admin);
		
		return new ResponseEntity<>(res,HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("/adminlogout")
	public ResponseEntity<String> LogoutAdmin(@RequestParam("key") String key )throws AdminException{
		
		String res = loginService.logoutAdmin(key);
		
		return new ResponseEntity<String>(res,HttpStatus.ACCEPTED);
		
	}

}
