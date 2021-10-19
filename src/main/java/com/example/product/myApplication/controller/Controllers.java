package com.example.product.myApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.myApplication.entity.Product;
import com.example.product.myApplication.service.ProductService;


@RestController
public class Controllers {

	@Autowired
	private ProductService service;

	@GetMapping(value="/home")
	public String index() {
		return "<h1>Hello World new<h1>";
	}
	
	@GetMapping(value = "/product")
	public List<Product> product() {
		return service.getProductList();
	}
	
	@GetMapping(value="/product/{id}")
	public Product getProductById(@PathVariable int id) {
		return service.getProduct(id);
	}
	
	@PostMapping(value="/product")
	public Product addProduct(@RequestBody Product product) {
		return service.addProduct(product);
	}
	
	@PutMapping(value="/product")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}
	
	@DeleteMapping(value="/product/{id}")
	public ResponseEntity<List<Product>> deleteProduct(@PathVariable int id){
		try {
			List<Product> product = service.deleteProduct(id);
			return new ResponseEntity<List<Product>>(product, HttpStatus.OK);			
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
