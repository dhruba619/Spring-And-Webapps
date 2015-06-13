import java.io.ObjectInputStream.GetField;

import com.dhruba619.service.CustomerServiceImpl;
import com.dhruba619.service.ICustomerService;


public class ApplicationExecutor {

	public static void main(String[] args) {
		ICustomerService service = new CustomerServiceImpl();
		
		System.out.println(service.giveAllCustomer().get(0).getFirstName());
	}

}
