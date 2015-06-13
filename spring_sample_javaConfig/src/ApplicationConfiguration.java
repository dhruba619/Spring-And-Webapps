import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dhruba619.dao.CustomerDaoImpl;
import com.dhruba619.service.CustomerServiceImpl;




@Configuration
@ComponentScan({"com.dhruba619"})
public class ApplicationConfiguration {
	
	
	
	/*
	 * Setter Injection
	 */
/*	@Bean(name="customerService")
	public CustomerServiceImpl getCustomerServiceImpl(){
		CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
		customerServiceImpl.setCustomerDao(getCustomerDao());
				
		return customerServiceImpl;
	}
	*/
	
	
	/*
	 * Constructor Injection
	 */
/*	@Bean(name="customerService")
	public CustomerServiceImpl getCustomerServiceImpl(){
		CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl(getCustomerDao());		
		return customerServiceImpl;
	}*/
	
	
	@Bean(name="customerService")
	public CustomerServiceImpl getCustomerServiceImpl(){
		CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();		
		return customerServiceImpl;
	}
	@Bean(name="customerDao")
	public CustomerDaoImpl getCustomerDao(){
		return new CustomerDaoImpl();
	}
}
