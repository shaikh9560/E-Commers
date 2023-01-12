package com.Model.Service;

import java.util.List;

import com.Model.Bean.Product;
import com.Model.Exception.Product_Exception;

public interface Product_Service {
	
  public Product AddProduct(Product product) throws Product_Exception;
	
	public List<Product> viewAllproducts() throws Product_Exception;
	
	public Product UpdateProduct(Product product) throws Product_Exception;
	
	public Product ViewProduct(Integer id) throws Product_Exception;
	
	public List<Product> ViewProudctbyCategory(String catname) throws Product_Exception;

	public Product RemoveProduct(Integer prodId) throws Product_Exception;

}
