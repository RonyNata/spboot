package com.kepegawaian.appkepegawaian.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Producer {

	@Id
	@Column(name = "producer_id")
	private String producerId;
	
	@Column(name = "producer_name")
	private String producerName;
	
	

	public String getProducerId() {
		return producerId;
	}

	public void setProducerId(String producerId) {
		this.producerId = producerId;
	}

	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}
}
