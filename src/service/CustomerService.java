package service;

import exception.CustomerNotFoundException;
import model.Customer;

public class CustomerService {
	
	public void creditCardService(Customer c) throws CustomerNotFoundException
	{
		
		if(c.getName().equals(""))
		{
			throw new CustomerNotFoundException("Not our Customer");
		}
		else
		{
			System.out.println("our customer found");
		}
		
	}

}
