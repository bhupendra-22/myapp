package com.example.product.myApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.myApplication.dao.ProductDao;
import com.example.product.myApplication.entity.Product;

@Service("productService")
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao productDao;
	

	@Override
	public List<Product> getProductList() {
		// TODO Auto-generated method stub
		return productDao.getProductList();
	}

	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return productDao.getProduct(id);
	}


	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.addProduct(product);
	}


	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.updateProduct(product);
	}


	@Override
	public List<Product> deleteProduct(int id) {
		// TODO Auto-generated method stub
		return productDao.deleteProduct(id);
	}	
	
}
