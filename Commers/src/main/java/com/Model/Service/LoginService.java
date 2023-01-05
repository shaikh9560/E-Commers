package com.Model.Service;

import org.springframework.stereotype.Service;

import com.Model.Bean.AdminDTO;
import com.Model.Exception.AdminException;


public interface LoginService {
	
	public String loginAdmin(AdminDTO admin) throws AdminException;
	
	public String logoutAdmin(String key) throws AdminException;

}
