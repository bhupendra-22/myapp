package com.example.product.myApplication.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.product.myApplication.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

Date d = new Date();
	
	List<Product> list;	
	
	public ProductDaoImpl() {
		
		list = new ArrayList<>();
		list.add(new Product(1, "Apple", 10, 100.0, d));
		list.add(new Product(2, "Banana", 12, 50.0, d));
		list.add(new Product(3, "Mango", 10, 100.0, d));
		list.add(new Product(4, "Grape", 30, 100.0, d));
		list.add(new Product(5, "Orange", 10, 100.0, d));
		
	}

	@Override
	public List<Product> getProductList() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		Product p = null;
		for(Product product:list) {
			if(product.getId()==id) {
				p=product;
				break;
			}
		}
		return p;
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		list.add(product);
		return product;
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		list.forEach(p -> {
			if(p.getId() == product.getId()) {
				p.setId(product.getId());
				p.setName(product.getName());
				p.setQuantity(product.getQuantity());
				p.setPrice(product.getPrice());	
				p.setExpdate(product.getExpdate());				
			}
		});
		return product;
	}

	@Override
	public List<Product> deleteProduct(int id) {
		// TODO Auto-generated method stub
		list = list.stream().filter(p -> p.getId()!=id).collect(Collectors.toList());
		return list;
	}

}
