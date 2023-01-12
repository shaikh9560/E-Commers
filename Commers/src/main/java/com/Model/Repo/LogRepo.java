package com.Model.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Model.Bean.CurrentUserSession;

@Repository
public interface LogRepo extends JpaRepository<CurrentUserSession, Integer> {
	
	
     public Optional<CurrentUserSession>findByuuid(String uuid);
	
	 public CurrentUserSession findByUuid(String uuid);

}
