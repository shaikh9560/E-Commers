package com.Model.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Bean.Product;
import com.Model.Exception.Product_Exception;
import com.Model.Service.Product_Service;

@RestController
public class ProductController {
	 @Autowired
	private Product_Service prods;
	 
	 @PostMapping("/Addproduct")
		public ResponseEntity<Product> AddproductHandler( @RequestBody Product prod)throws Product_Exception{
			
			   Product pr = prods.AddProduct(prod);
			   
			   return new ResponseEntity<Product>(pr, HttpStatus.OK);
		}

}
