import java.io.ObjectInputStream.GetField;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.dhruba619.dao.CustomerDaoImpl;
import com.dhruba619.service.CustomerServiceImpl;




@Configuration
//@ComponentScan({"com.dhruba619"})
@PropertySource("application.properties")//For importing the property file
public class ApplicationConfiguration {
	
	
	/*
	 * The below bean is required to use the @Value Annotation. Also this need aop jar
	 */
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	
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
	@Scope("singleton")// We need spring aop library to use the singleton scope
	public CustomerServiceImpl getCustomerServiceImpl(){
		CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl(getCustomerDao());		
		return customerServiceImpl;
	}
	@Bean(name="customerDao")
	public CustomerDaoImpl getCustomerDao(){
		return new CustomerDaoImpl();
	}
	
	/*
	 * 
	 * NOTE
	 * Prototype scope (scope="protoype") gives a new instance everytime we request.
	 */
}

