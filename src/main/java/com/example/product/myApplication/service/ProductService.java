package com.example.product.myApplication.service;

import java.util.List;

import com.example.product.myApplication.entity.Product;

public interface ProductService {

	public List<Product> getProductList();
	
	public Product getProduct(int id);
	
	public Product addProduct(Product product);

	public Product updateProduct(Product product);

	public List<Product> deleteProduct(int id);

}
