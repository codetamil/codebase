package com;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringManipulation {
	static Scanner ss= new Scanner(System.in);
	static void addSubString(String s)
	{
		
		StringBuffer sb= new StringBuffer(s);
		
		System.out.println("Enter the index:");
		int index=ss.nextInt();
		System.out.println("enter the subString:");
		String subString=ss.next();
		sb.insert(index,subString);
		
		System.out.println(sb);
		
	}
	static void splitStringByComma()
	{
		String strMain = "Alpha, Beta, Delta, Gamma, Sigma";
	    StringTokenizer st=new StringTokenizer(strMain, ",");
	    while(st.hasMoreElements())
	    {
	      System.out.println(st.nextToken());
	    }

	}
	
	static void splitStringBySpace()
	{
	String strMain="Welcome to cognizant";
		StringTokenizer st=new StringTokenizer(strMain, " ");
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken());
		}
		}
		    

	
	
	public static void main(String args[])
	{
		/*System.out.println("Split String by Comma....");
		splitStringByComma();
		
		
		System.out.println("Split String by Space....");
		splitStringBySpace();*/
		
		//System.out.println("Name an american president who was shot?");
		
		String usprez=ss.nextLine();
		addSubString(usprez);
	}
	
	
	 


}
