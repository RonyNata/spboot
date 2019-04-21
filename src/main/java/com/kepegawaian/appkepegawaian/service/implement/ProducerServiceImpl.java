package com.kepegawaian.appkepegawaian.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kepegawaian.appkepegawaian.model.Producer;
import com.kepegawaian.appkepegawaian.repository.ProducerRepository;
import com.kepegawaian.appkepegawaian.service.ProducerService;

@Service(value = "ProducerService")
public class ProducerServiceImpl implements ProducerService {

	@Autowired
	private ProducerRepository producerRepository;
	@Override
	public List<Producer> getAllProducer() {
		
		return producerRepository.findAll();
	}

	@Override
	public Producer getProducer(String id) {
		
		return producerRepository.getOne(id);
	}

	@Override
	public void createProducer(Producer producer) {
		
		producerRepository.save(producer);
	}

	@Override
	public void updateProducer(Producer producer) {
		
		producerRepository.save(producer);
	}

	@Override
	public void deleteProducer(String id) {
		
		producerRepository.deleteById(id);
	}

}
