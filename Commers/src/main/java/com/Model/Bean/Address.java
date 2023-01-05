package com.Model.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.convert.DataSizeUnit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer adressId;
	
	 private Integer streetNo;
	
	 private String buildingName;
	 
	 private String city;
	 
	 private String state;
	 
	 
	 private String country;
	 
	 private String pincode;
	
	

}
