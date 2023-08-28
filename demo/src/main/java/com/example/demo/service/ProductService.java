package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.Product;
import com.example.demo.exception.ProductNotFoundException;


public interface ProductService {
	public Product saveProduct(Product product);
	public List<Product> fetchAllProducts();
	public Product fetchProduct(Long id) throws ProductNotFoundException;
	public List<Product> saveProducts(List<Product> products);
	
}
