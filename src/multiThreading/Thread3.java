package multiThreading;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Thread3 extends Thread {
	
public Thread3()
{
	setPriority(10); 
	//start();
}
public void run()
{
	try {
		int t=averageFinder();
		Thread.sleep(2000);
		System.out.println(t);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

	public int averageFinder() throws Exception
	{
		
		
		int sum=0;
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		int numbers[]= new int[n];
		for(int j=0;j<n;j++)
		{numbers[j]=Integer.parseInt(br.readLine());
			sum=sum+(numbers[j]);
		}
		
		return sum;
		
	}
}
