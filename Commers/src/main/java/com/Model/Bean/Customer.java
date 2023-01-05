package com.Model.Bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cusomerId;
	
	private String firstName;
	
	
	private String email;
	
	private String password;
	
	
	
	
	
	
	//@JoinTable(name = "cus_Address", joinColumns = @JoinColumn(name ="customer_id", referencedColumnName = "customerId"))
	@OneToOne(cascade =CascadeType.ALL)
	private Address address;
	

}
