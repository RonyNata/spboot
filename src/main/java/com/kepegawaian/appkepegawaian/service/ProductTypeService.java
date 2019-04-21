package com.kepegawaian.appkepegawaian.service;

import java.util.List;
import java.util.Optional;

import com.kepegawaian.appkepegawaian.model.ProductType;

public interface ProductTypeService {

	public List<ProductType> getAllProductType();
	public Optional<ProductType> getProductType(String id);
	public void createProductType(ProductType productType);
	public void updateProductType(ProductType productType);
	public void deleteProductType(String id);
}
