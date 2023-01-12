package com.Model.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.Bean.Admin;
import com.Model.Exception.AdminException;
import com.Model.Repo.Admin_Repo;


@Service
public class Admin_IMPL  implements Admin_Service{
	
	
	
	/*----------------------------injecting customerReposityr interface ----------------------------------*/
	
	@Autowired
	Admin_Repo admin_Repo;
	
	
	
	/*----------------------------Adding Admin in database ----------------------------------*/
	   

	@Override
	public Admin RegisterAdmin(Admin admin) throws AdminException {
		
		Admin admin2 = admin_Repo.findByAdminUsername(admin.getAdminUsername());
		
		
	     if(admin2 != null) {
	    	 
	     
	    	 throw new AdminException("Admin already Exists ");
	    	// Admin saveAdmin = admin_Repo.save(admin);
	    
	     }
	    
	    	
			return admin_Repo.save(admin);

			
			
			
		}
	}

	
	
	
	
	
	


