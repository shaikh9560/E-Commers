package com.Model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.Bean.Product;
import com.Model.Exception.Product_Exception;
import com.Model.Repo.Product_Repo;

import lombok.Setter;

@Service
public class ProductServiceIMPL implements Product_Service {
	
	
	@Autowired
	Product_Repo prod;

	@Override
	public Product AddProduct(Product product) throws Product_Exception {
		// TODO Auto-generated method stub
		return prod.save(product);
	}

	@Override
	public List<Product> viewAllproducts() throws Product_Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product UpdateProduct(Product product) throws Product_Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product ViewProduct(Integer id) throws Product_Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> ViewProudctbyCategory(String catname) throws Product_Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product RemoveProduct(Integer prodId) throws Product_Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
