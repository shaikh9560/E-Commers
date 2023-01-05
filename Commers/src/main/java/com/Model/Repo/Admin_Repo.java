package com.Model.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Model.Bean.Admin;
import com.Model.Exception.AdminException;



public interface Admin_Repo extends JpaRepository<Admin, Integer> {
	
	
	public Admin findByAdminUsername(String adminUsername)throws AdminException;

	
	
}
