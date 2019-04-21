package com.kepegawaian.appkepegawaian.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kepegawaian.appkepegawaian.model.ProductType;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType, String> {
	
	@Query(value = "select t from ProductType t left join fetch t.products p")
	Optional<ProductType> findById(String id);
}
