package com.kepegawaian.appkepegawaian.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kepegawaian.appkepegawaian.model.Producer;

@Repository
public interface ProducerRepository extends JpaRepository<Producer, String> {

}
