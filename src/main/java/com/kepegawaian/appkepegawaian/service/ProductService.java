package com.kepegawaian.appkepegawaian.service;

import java.util.List;
import java.util.Optional;

import com.kepegawaian.appkepegawaian.model.Product;

public interface ProductService {

	public List<Product> getAllProduct();
	public Optional<Product> getProduct(String id);
	public void createProduct(Product product);
	public void updateProduct(Product product);
	public void deleteProduct(String id);
}
