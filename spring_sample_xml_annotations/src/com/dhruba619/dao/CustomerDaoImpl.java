package com.dhruba619.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dhruba619.model.Customer;



@Repository("iCustomerDao")
public class CustomerDaoImpl implements ICustomerDao {
	
	/* (non-Javadoc)
	 * @see com.dhruba619.dao.ICustomerDao#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		
		List<Customer> customerList = new ArrayList<>();
		Customer customer = new Customer();
		
		customer.setFirstName("Dhrubajyoti");
		customer.setLastName("Bhattacharjee");
		
		customerList.add(customer);
		return customerList;
		
	}

}
