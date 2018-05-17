package exe;

import exception.CustomerNotFoundException;
import service.CustomerService;
import model.Customer;

public class Main {

	public static void main(String[] args)  {
		try
		{
			Customer c=new Customer();
		
        c.setId(76847);
        c.setName("");
        c.setPh("892758");
		CustomerService ob=new CustomerService();
		ob.creditCardService(c);
		}
		catch(CustomerNotFoundException tim)
		{System.out.println("Exception handled");
			
		}
		
		

	}

}
