package com.Model.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Model.Bean.Customer;
import com.Model.Exception.Customer_Exception;

@Repository
public interface Customer_Repo extends JpaRepository<Customer, Integer> {
    public Customer findByUsername(String username)throws Customer_Exception;
	
	public Customer findByemail(String email);
	
	public Optional<Customer> findBymobilenumber(String mobileNumber) throws Customer_Exception;
	
	
	
	
}
