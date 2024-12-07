package com.bscrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bscrud.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer>{
	
	public Product findByRollno(int rollno);
	
	public Product findByUsernameAndPassword(String username, String password);

}
