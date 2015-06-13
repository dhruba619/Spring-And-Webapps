package com.dhruba619.service;

import java.util.List;

import com.dhruba619.dao.IBillingDao;
import com.dhruba619.dao.ICustomerDao;
import com.dhruba619.model.Customer;

public class CustomerServiceImpl implements ICustomerService {
	
	private ICustomerDao customerDao;
	private IBillingDao billingDao;
	
	public CustomerServiceImpl(IBillingDao billingDao){
		this.billingDao = billingDao;
	}
	
	public void setCustomerDao(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public List<Customer> giveAllCustomer(){
		return customerDao.findAll();
	}

	@Override
	public String getCustomerBill(String name) {
		
		return this.billingDao.getTotalBill(name);
	}

}
