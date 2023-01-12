package com.Model.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Model.Bean.Customer_User_session;

@Repository
public interface CustomerLogin_repo extends JpaRepository<Customer_User_session, Integer> {
	
	
    public Optional<Customer_User_session>findByuuid(String uuid);
	
	public Customer_User_session findByUuid(String uuid);

}
