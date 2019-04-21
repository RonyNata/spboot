package com.kepegawaian.appkepegawaian.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kepegawaian.appkepegawaian.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String>{
	
	@Query(value = "select p from Product p left join fetch p.productType left join "
			+ "fetch p.producer")
	List<Product> findAll();
}
