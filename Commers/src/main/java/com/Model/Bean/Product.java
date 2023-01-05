package com.Model.Bean;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ProductId;
	private  String ProductName;
	
	private Integer ProductQunatity;
	private Integer ProductPrice;
	
	
	@Embedded 
	private  ProductCategory productcategory;
	

}
