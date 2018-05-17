package exceptionHandling;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//int i=10/0;
			//System.out.println(i);
			System.out.println(args[0]);
			
			
			int s= Integer.parseInt("dfasd");
			System.out.println(s);
			BufferedReader br= new BufferedReader
					(new InputStreamReader(System.in));
			
			br.read();
			
			System.out.println("lines of code....");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	
	}

}
