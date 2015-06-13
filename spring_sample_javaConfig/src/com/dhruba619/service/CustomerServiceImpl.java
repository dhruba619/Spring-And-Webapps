package com.dhruba619.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dhruba619.dao.CustomerDaoImpl;
import com.dhruba619.dao.ICustomerDao;
import com.dhruba619.model.Customer;

public class CustomerServiceImpl implements ICustomerService {
	
	
	@Autowired
	private ICustomerDao customerDao;
	
	public CustomerServiceImpl(){}
	
	public CustomerServiceImpl(ICustomerDao customerDao){
		System.out.println("Using constructor injection");
		this.customerDao = customerDao;
	}
	
	public void setCustomerDao(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}


	@Override
	public List<Customer> giveAllCustomer(){
		return customerDao.findAll();
	}

}
