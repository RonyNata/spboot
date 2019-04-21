package com.kepegawaian.appkepegawaian.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kepegawaian.appkepegawaian.model.ProductType;
import com.kepegawaian.appkepegawaian.repository.ProductTypeRepository;
import com.kepegawaian.appkepegawaian.service.ProductTypeService;

@Service(value = "ProductTypeService")
public class ProductTypeServiceImpl implements ProductTypeService {

	@Autowired
	private ProductTypeRepository productTypeRepository;
	
	@Override
	public List<ProductType> getAllProductType() {
		
		return productTypeRepository.findAll();
	}

	@Override
	public Optional<ProductType> getProductType(String id) {
		
		return productTypeRepository.findById(id);
	}

	@Override
	public void createProductType(ProductType productType) {
		
		productTypeRepository.save(productType);
	}

	@Override
	public void updateProductType(ProductType productType) {
		
		productTypeRepository.save(productType);
	}

	@Override
	public void deleteProductType(String id) {
		
		productTypeRepository.deleteById(id);
	}

	
}
