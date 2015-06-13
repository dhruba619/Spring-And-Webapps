package com.dhruba619.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhruba619.dao.IBillingDao;
import com.dhruba619.dao.ICustomerDao;
import com.dhruba619.model.Customer;

@Service("iCustomerService")
public class CustomerServiceImpl implements ICustomerService {

	private ICustomerDao customerDao;
	
	/*
	 * Default no-arg constructor
	 */
	public CustomerServiceImpl(){
		
	}

	/*
	 * Member Autowiring, commented as we used constructor autowiring for this
	 * member
	 */
	// @Autowired
	private IBillingDao billingDao;

	/*
	 * Constructor Autowiring
	 */
	@Autowired
	public CustomerServiceImpl(IBillingDao billingDao) {
		this.billingDao = billingDao;
	}

	/*
	 * Setter AutoWiring, for setter injection we need a default no-arg constructor
	 */
	@Autowired
	public void setCustomerDao(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public List<Customer> giveAllCustomer() {
		return customerDao.findAll();
	}

	@Override
	public String getCustomerBill(String name) {

		return this.billingDao.getTotalBill(name);
	}

}
