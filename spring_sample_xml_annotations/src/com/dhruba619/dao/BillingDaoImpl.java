package com.dhruba619.dao;

import org.springframework.stereotype.Repository;


@Repository("iBillingDao")
public class BillingDaoImpl implements IBillingDao {

	/* (non-Javadoc)
	 * @see com.dhruba619.dao.IBillingDao#getTotalBill(java.lang.String)
	 */
	@Override
	public String getTotalBill(String customerName){
		
		
		return "100";
	}
}
