package com.kepegawaian.appkepegawaian.service;

import java.util.List;

import com.kepegawaian.appkepegawaian.model.Producer;

public interface ProducerService {
	
	public List<Producer> getAllProducer();
	public Producer getProducer(String id);
	public void createProducer(Producer producer);
	public void updateProducer(Producer producer);
	public void deleteProducer(String id);
}
