import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dhruba619.service.CustomerServiceImpl;


public class ApplicationExecutor {

	public static void main(String[] args) {
		//ICustomerService service = new CustomerServiceImpl();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerServiceImpl service = appContext.getBean(CustomerServiceImpl.class);
		
		System.out.println(service.giveAllCustomer().get(0).getFirstName());
		System.out.println(service.getCustomerBill("Dhrubajyoti"));
	}

}
