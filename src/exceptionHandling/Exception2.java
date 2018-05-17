package exceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//import java.io.PrintWriter;
import java.util.HashSet;

public class Exception2 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		readFromAFile();
		
		
	}
	
	static void readFromAFile() throws IOException
	{
		File ff= new File("a.txt");
		
		
		
		
		if(ff.createNewFile())
		{
			System.out.println("New File Created..");
		}
		else
		{
			System.out.println("file already exists");
		}
		
//PrintWriter manish=new PrintWriter(ff);
		HashSet hs=new HashSet();
		//manish.write("Welcome to file programming");
		//manish.close();
		
		BufferedReader br= new BufferedReader(new FileReader(ff));
		
		while(br.ready()){
			hs.add(br.readLine());
			
			
		}
		System.out.println(hs);
		

	}

}
