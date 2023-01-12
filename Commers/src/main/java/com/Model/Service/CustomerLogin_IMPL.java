package com.Model.Service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.Bean.Admin;
import com.Model.Bean.CurrentUserSession;
import com.Model.Bean.Customer;
import com.Model.Bean.CustomerDTO;
import com.Model.Bean.Customer_User_session;
import com.Model.Exception.AdminException;
import com.Model.Exception.Customer_Exception;
import com.Model.Repo.CustomerLogin_repo;
import com.Model.Repo.Customer_Repo;

import net.bytebuddy.utility.RandomString;

@Service
public class CustomerLogin_IMPL  implements Customer_Login{
	
	
	@Autowired
	private Customer_Repo customer_Repo;
	
	
	@Autowired
	private CustomerLogin_repo customerLogin_repo;

	@Override
	public String CustomerLofin(CustomerDTO customerDTO) throws Customer_Exception {
	      Customer existingUser = customer_Repo.findByUsername(customerDTO.getUsername());
			
			if (existingUser == null)
				throw new Customer_Exception("Invalid credentials. Username does not exist " + customerDTO.getUsername());
		
			Optional<Customer_User_session> validCustomerSessionOpt = customerLogin_repo.findById(existingUser.getCustomerid());		
			if (validCustomerSessionOpt.isPresent()) {
		
				throw new Customer_Exception("User already Logged In with this username");
		
			}
		
			if (existingUser.getPassword().equals(customerDTO.getPassword())) {
		
				String key = RandomString.make(6);
		
				Boolean isAdmin = true;
		
				Customer_User_session cs = new Customer_User_session(existingUser.getCustomerid(), key, isAdmin, LocalDateTime.now());

				  customerLogin_repo.save(cs);
		
				return cs.toString();
			} else
				throw new Customer_Exception("Please Enter a valid password");
			
			
			
	}

	@Override
	public String CustomerLogout(String key) throws Customer_Exception {

		Customer_User_session validCustomerSession = customerLogin_repo.findByUuid(key);

		if (validCustomerSession == null) {
			throw new Customer_Exception("User Not Logged In with this username");

		}

		customerLogin_repo.delete(validCustomerSession);

		return "Logged Out !";
	
	
	}

	}


