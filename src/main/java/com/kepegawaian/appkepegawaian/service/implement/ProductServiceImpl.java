package com.kepegawaian.appkepegawaian.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kepegawaian.appkepegawaian.model.Product;
import com.kepegawaian.appkepegawaian.repository.ProductRepository;
import com.kepegawaian.appkepegawaian.service.ProductService;

@Service(value = "ProductService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	@Override
	public List<Product> getAllProduct() {
		
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> getProduct(String id) {
		
		return productRepository.findById(id);
	}

	@Override
	public void createProduct(Product product) {
		
		productRepository.save(product);
	}

	@Override
	public void updateProduct(Product product) {
		
		productRepository.save(product);
	}

	@Override
	public void deleteProduct(String id) {
		
		productRepository.deleteById(id);
	}

}
