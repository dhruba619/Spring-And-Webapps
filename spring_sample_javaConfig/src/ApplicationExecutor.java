import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dhruba619.service.CustomerServiceImpl;
import com.dhruba619.service.ICustomerService;

public class ApplicationExecutor {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ApplicationConfiguration.class);
		
		
		//ICustomerService service = applicationContext.getBean(CustomerServiceImpl.class);
		ICustomerService service = applicationContext.getBean("customerService",CustomerServiceImpl.class);
		
		/*
		 * To see if singleton scope worked or not, let create one more object and print both
		 */
		
		ICustomerService service2 = applicationContext.getBean(CustomerServiceImpl.class);
		
		System.out.println(service);
		System.out.println(service2);
		
		/*
		 * if they pring the object address same like this:
		 * 
		 * com.dhruba619.service.CustomerServiceImpl@4493d195
			com.dhruba619.service.CustomerServiceImpl@4493d195
			it works
		 */

		System.out.println(service.giveAllCustomer().get(0).getFirstName());
	}

}
