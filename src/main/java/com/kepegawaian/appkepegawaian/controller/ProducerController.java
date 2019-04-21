package com.kepegawaian.appkepegawaian.controller;

import org.aspectj.bridge.Message;
import org.hibernate.validator.internal.engine.messageinterpolation.parser.MessageDescriptorFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kepegawaian.appkepegawaian.model.Producer;
import com.kepegawaian.appkepegawaian.service.ProducerService;

@RestController
public class ProducerController {

	@Autowired
	private ProducerService producerService;
	
	@RequestMapping(value = "/get-producers")
	public ResponseEntity<?> getProducers(){
		return new ResponseEntity<>(producerService.getAllProducer(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/get-producer/{id}")
	public ResponseEntity<?> getProducer(@PathVariable("id") String id){
		return new ResponseEntity<>(producerService.getProducer(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/create-producer", method = RequestMethod.POST)
	public ResponseEntity<?> createProducer(@RequestBody Producer producer){
		producerService.createProducer(producer); 
		return new ResponseEntity<>("Create Complete!!", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/update-producer", method = RequestMethod.PUT)
	public ResponseEntity<?> updateProducer(@RequestBody Producer producer){
		producerService.updateProducer(producer);
		return new ResponseEntity<>("Update Complete!!", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteProducer(@PathVariable("id") String id){
		producerService.deleteProducer(id);
		return new ResponseEntity<>("Create Complete!!", HttpStatus.OK);
	}
}
