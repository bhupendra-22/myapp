package com.example.product.myApplication.dao;

import java.util.List;

import com.example.product.myApplication.entity.Product;

public interface ProductDao {

public List<Product> getProductList();
	
	public Product getProduct(int id);
	
	public Product addProduct(Product product);

	public Product updateProduct(Product product);

	public List<Product> deleteProduct(int id);
}
