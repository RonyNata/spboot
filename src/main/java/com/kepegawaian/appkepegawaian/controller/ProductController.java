package com.kepegawaian.appkepegawaian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kepegawaian.appkepegawaian.model.Product;
import com.kepegawaian.appkepegawaian.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/get-products")
	public ResponseEntity<?> getProduct(){
		return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/get-product/{id}")
	public ResponseEntity<?> getProduct(@PathVariable("id") String id){
		return new ResponseEntity<>(productService.getProduct(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/create-product", method = RequestMethod.POST)
	public ResponseEntity<?> createProductType(@RequestBody Product productType){
		productService.createProduct(productType);
		return new ResponseEntity<>("Create Complete!!", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/update-product", method = RequestMethod.PUT)
	public ResponseEntity<?> updateProduct(@RequestBody Product productType){
		productService.updateProduct(productType);
		return new ResponseEntity<>("Update Complete!!", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/delete-product/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteProduct(@PathVariable("id") String id){
		productService.deleteProduct(id);
		return new ResponseEntity<>("Delete Complete!!", HttpStatus.OK);
	}
}
