package com.kepegawaian.appkepegawaian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kepegawaian.appkepegawaian.model.ProductType;
import com.kepegawaian.appkepegawaian.service.ProductTypeService;

@RestController
public class ProductTypeController {

	@Autowired
	private ProductTypeService productTypeService;
	
	@RequestMapping(value = "/get-product-types")
	public ResponseEntity<?> getProductTypes(){
		return new ResponseEntity<>(productTypeService.getAllProductType(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/get-product-type/{id}")
	public ResponseEntity<?> getProductType(@PathVariable("id") String id){
		return new ResponseEntity<>(productTypeService.getProductType(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/create-product-type", method = RequestMethod.POST)
	public ResponseEntity<?> createProductType(@RequestBody ProductType productType){
		productTypeService.createProductType(productType);
		return new ResponseEntity<>("Create Complete!!", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/update-product-type", method = RequestMethod.PUT)
	public ResponseEntity<?> updateProductType(@RequestBody ProductType productType){
		productTypeService.updateProductType(productType);
		return new ResponseEntity<>("Update Complete!!", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/delete-product-type/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteProductType(@PathVariable("id") String id){
		productTypeService.deleteProductType(id);
		return new ResponseEntity<>("Delete Complete!!", HttpStatus.OK);
	}
}
