package com.Model.Service;

import com.Model.Bean.AdminDTO;
import com.Model.Bean.CustomerDTO;
import com.Model.Exception.AdminException;
import com.Model.Exception.Customer_Exception;

public interface Customer_Login {
	
	
     public String CustomerLofin(CustomerDTO customerDTO) throws Customer_Exception;
	
	   public String CustomerLogout(String key) throws Customer_Exception;

}
