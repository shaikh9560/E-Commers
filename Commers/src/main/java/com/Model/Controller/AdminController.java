package com.Model.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Bean.Admin;
import com.Model.Exception.AdminException;
import com.Model.Service.Admin_Service;

@RestController
public class AdminController {
	
	
	@Autowired
	Admin_Service admin_Service;
	
	
	
	//------------------------ add Admin handler------------------------------------

	@PostMapping("/admins")
	public ResponseEntity<Admin> addAdminHandler(@RequestBody Admin admin) throws AdminException
	{
		return new ResponseEntity<Admin>(admin_Service.RegisterAdmin(admin),HttpStatus.CREATED);
	}
	

}
