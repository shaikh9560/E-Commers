package com.Model.Bean;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
	
	
	private String houseNo;
	private String stNo;
	private String city;
	private String country;
	private int pindcode;

}
