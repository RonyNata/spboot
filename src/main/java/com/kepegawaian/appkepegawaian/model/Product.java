package com.kepegawaian.appkepegawaian.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Product {
	
	@Id
	@Column(name = "product_id")
	private String productId;
	
	@Column(name = "product_name")
	private String productName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "producer_id")
	private Producer producer;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "type_id")
	private ProductType productType;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Producer getProducer() {
		return producer;
	}

	public void setProducer(Producer producer) {
		this.producer = producer;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
}
