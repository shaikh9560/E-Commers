package com.Model.Service;

import com.Model.Bean.Customer;
import com.Model.Exception.Customer_Exception;

public interface Customer_Service {
	
	
	public Customer RegisterCustomer(Customer customer) throws Customer_Exception;

	public Customer UpdateCustomer(Customer customer) throws Customer_Exception;
	
	public Customer RemoveCustomer(Customer id) throws Customer_Exception;
	
	public Customer viewCustomer(Integer cusInteger) throws Customer_Exception;

}
