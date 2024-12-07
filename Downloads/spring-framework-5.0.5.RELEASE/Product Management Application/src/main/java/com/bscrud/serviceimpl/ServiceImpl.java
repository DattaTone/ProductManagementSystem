package com.bscrud.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bscrud.model.Product;
import com.bscrud.repository.ProductRepository;
import com.bscrud.servicei.ServiceI;

@Service
public class ServiceImpl implements ServiceI{
	
	@Autowired
	ProductRepository sr;

	@Override
	public void saveStudent(Product s) {
		sr.save(s);
	}

	@Override
	public Iterable<Product> getAllStudent() {
		return sr.findAll();
	}

	@Override
	public Product editStudent(int rollno) {
		return sr.findByRollno(rollno);
	}

	@Override
	public void deleteStudent(Product s) {
		sr.delete(s);
		
	}

	@Override
	public Product loginCheck(String username, String password) {
		
		return sr.findByUsernameAndPassword(username, password);
	}
}
