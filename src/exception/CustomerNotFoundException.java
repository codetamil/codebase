package exception;

public class CustomerNotFoundException extends Exception{
	
	
	public CustomerNotFoundException(String message)
	{
		System.out.println(message);
	}

}
