package com.Model.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Model.Bean.Admin;
import com.Model.Exception.AdminException;


@Repository
public interface Admin_Repo extends JpaRepository<Admin, Integer> {
	
	
	public Admin findByAdminUsername(String adminUsername)throws AdminException;

	
	
}
