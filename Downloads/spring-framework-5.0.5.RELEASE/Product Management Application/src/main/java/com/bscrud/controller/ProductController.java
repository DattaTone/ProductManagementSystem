package com.bscrud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bscrud.model.Product;
import com.bscrud.servicei.ServiceI;

@Controller
public class ProductController {
	
	@Autowired
	ServiceI si;
	
	@RequestMapping("/")
	public String homepage()
	{
		return "login";
	}
	
	@RequestMapping("/register")
	public String regpage()
	{
		return "register";
	}

    @RequestMapping("/save")
	public String saveStudent(@ModelAttribute Product s)
	{
    	si.saveStudent(s);
		return "login";
	}
    
    @RequestMapping("/login")
    public String loginsuccess(@RequestParam("username") String un, @RequestParam("password") String ps, Model m)
    {
    	Product st = si.loginCheck(un, ps);
    	
    	if(st==null && un.equals("admin") && ps.equals("123"))
    	{
    	
    	Iterable<Product> allStudent=si.getAllStudent();
    	m.addAttribute("data", allStudent);
    	return "loginsuccess";
    }
    	else if(st!=null)
    	{
    		List<Product> sList=new ArrayList<>();
    		sList.add(st);
    		m.addAttribute("data", sList);
    		return "loginsuccess";
    	}
    	else {
    		m.addAttribute("msg", "Invalid Login Details...");
    		return "login";
    	}
    }
    
    @RequestMapping("/edit")
    public String editStudent(@RequestParam("rollno") int rollno,Model m)
    {
    	
    	Product st=si.editStudent(rollno);
    	m.addAttribute("stu", st);
    	return "edit";	
    }
    
    @RequestMapping("/update")
    public String updateStudent(@ModelAttribute Product s,Model m) 
    {   
    	si.saveStudent(s);
    	Iterable<Product> allStudent=si.getAllStudent();
    	m.addAttribute("data", allStudent);
    	return "loginsuccess";
    }
    
    @RequestMapping("/delete")
    public String deleteStudent(@ModelAttribute Product s,Model m) 
    {   
    	si.deleteStudent(s);
    	Iterable<Product> allStudent=si.getAllStudent();
    	m.addAttribute("data", allStudent);
    	return "loginsuccess";
    }   
}