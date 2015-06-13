package com.dhruba619.service;

import java.util.List;

import com.dhruba619.model.Customer;

public interface ICustomerService {

	public abstract List<Customer> giveAllCustomer();
	public abstract String getCustomerBill(String name);

}