package com.Model.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.Bean.Admin;
import com.Model.Bean.AdminDTO;
import com.Model.Bean.CurrentUserSession;
import com.Model.Exception.AdminException;
import com.Model.Repo.Admin_Repo;
import com.Model.Repo.LogRepo;

import net.bytebuddy.utility.RandomString;

@Service
public class LoginServiceIMPL implements LoginService{
	
	
	@Autowired
	Admin_Repo admindao;
	
	@Autowired
	LogRepo currUserSession;
	@Override
	public String loginAdmin(AdminDTO admin)throws AdminException {
		
      Admin existingUser = admindao.findByAdminUsername(admin.getAdminUsername());
		
		if (existingUser == null)
			throw new AdminException("Invalid credentials. Username does not exist " + admin.getAdminUsername());
	
		java.util.Optional<CurrentUserSession> validCustomerSessionOpt = currUserSession.findById(existingUser.getAdminId());
	
		if (validCustomerSessionOpt.isPresent()) {
	
			throw new AdminException("User already Logged In with this username");
	
		}
	
		if (existingUser.getAdminPassword().equals(admin.getAdminPassword())) {
	
			String key = RandomString.make(6);
	
			Boolean isAdmin = true;
	
			CurrentUserSession cs = new CurrentUserSession(existingUser.getAdminId(), key, isAdmin, LocalDateTime.now());

			currUserSession.save(cs);
	
			return cs.toString();
		} else
			throw new AdminException("Please Enter a valid password");
		
		
		
	}

	@Override
	public String logoutAdmin(String key) throws AdminException {
	   
		CurrentUserSession validCustomerSession = currUserSession.findByUuid(key);

		if (validCustomerSession == null) {
			throw new AdminException("User Not Logged In with this username");

		}

		currUserSession.delete(validCustomerSession);

		return "Logged Out !";
	
	
	}

}
