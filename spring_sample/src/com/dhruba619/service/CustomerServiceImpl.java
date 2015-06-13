package com.dhruba619.service;

import java.util.List;

import com.dhruba619.dao.CustomerDaoImpl;
import com.dhruba619.dao.ICustomerDao;
import com.dhruba619.model.Customer;

public class CustomerServiceImpl implements ICustomerService {
	
	private ICustomerDao customerDao = new CustomerDaoImpl();
	
	/* (non-Javadoc)
	 * @see com.dhruba619.service.ICustomerService#giveAllCustomer()
	 */
	@Override
	public List<Customer> giveAllCustomer(){
		return customerDao.findAll();
	}

}
