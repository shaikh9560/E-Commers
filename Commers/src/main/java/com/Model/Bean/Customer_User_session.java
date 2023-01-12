package com.Model.Bean;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer_User_session {
	@Id
	private Integer userId;

	private String uuid;

	private Boolean admin;

	private LocalDateTime localDateTime;
}
