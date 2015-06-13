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

		System.out.println(service.giveAllCustomer().get(0).getFirstName());
	}

}
