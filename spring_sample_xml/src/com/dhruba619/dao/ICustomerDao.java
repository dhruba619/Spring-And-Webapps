package com.dhruba619.dao;

import java.util.List;

import com.dhruba619.model.Customer;

public interface ICustomerDao {

	public abstract List<Customer> findAll();

}