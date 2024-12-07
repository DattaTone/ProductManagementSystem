package com.bscrud.servicei;

import com.bscrud.model.Product;

public interface ServiceI {
	
	public void saveStudent(Product s);
	
	public Iterable<Product>getAllStudent();
	
	public Product editStudent(int rollno);
	
	public void deleteStudent(Product s);
	
	public Product loginCheck(String username, String password);
	
}
