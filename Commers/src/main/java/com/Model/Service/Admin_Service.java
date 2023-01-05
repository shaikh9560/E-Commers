package com.Model.Service;

import org.springframework.stereotype.Service;

import com.Model.Bean.Admin;
import com.Model.Exception.AdminException;



public interface Admin_Service {
	
	public Admin RegisterAdmin(Admin admin)throws AdminException;

}
