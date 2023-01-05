package com.Model.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Model.Bean.CurrentUserSession;

public interface LogRepo extends JpaRepository<CurrentUserSession, Integer> {
   public Optional<CurrentUserSession>findByuuid(String uuid);
	
	public CurrentUserSession findByUuid(String uuid);

}
