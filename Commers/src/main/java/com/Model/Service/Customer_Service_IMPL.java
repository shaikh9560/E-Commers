package com.Model.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.Bean.Admin;
import com.Model.Bean.Customer;
import com.Model.Exception.AdminException;
import com.Model.Exception.Customer_Exception;
import com.Model.Repo.Customer_Repo;

@Service
public class Customer_Service_IMPL  implements Customer_Service {

	
	@Autowired
	private Customer_Repo customer_Repo;
	
	@Override
	public Customer RegisterCustomer(Customer customer) throws Customer_Exception {
		
         Customer add = customer_Repo.save(customer);
		
		if(add==null) {
			throw new Customer_Exception("No data found ");
		}
		else {
			return add;
		}
		
		
//		Customer admin2 = customer_Repo.findByUsername(customer.getUsername());
//		
//		
//	     if(admin2 != null) {
//	    	 
//	     
//	    	 throw new Customer_Exception("Admin already Exists ");
//	    	
//	    
//	     }
//	    
//	    	
//			return customer_Repo.save(customer);

	}

	@Override
	public Customer UpdateCustomer(Customer customer) throws Customer_Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer RemoveCustomer(Customer id) throws Customer_Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer viewCustomer(Integer cusInteger) throws Customer_Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
