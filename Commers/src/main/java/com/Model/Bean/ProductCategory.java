package com.Model.Bean;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductCategory {
	
	private Integer CategoryId;
	
	
	private String categoryName;

}
