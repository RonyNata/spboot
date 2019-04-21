package com.kepegawaian.appkepegawaian.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ProductType {

	@Id
	@Column(name = "type_id")
	private String typeId;
	
	@Column(name = "type_name")
	private String typeName;
	
	@OneToMany(mappedBy = "productType", cascade = CascadeType.ALL)
	
	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}
	
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
}
