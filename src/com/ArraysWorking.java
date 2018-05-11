package com;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArraysWorking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	copyArray();
		copyArrayUsingClone();
		copyArrayUsingArrayCopy();
		
		fillArray(18,23,45,67,78,20,6);
		
		
		int j= getInput().nextInt();*/
		
		System.out.println("Enter a number");
		
		String s= getInput().next();
		
		System.out.println( convertStringToInteger(s));
		
		
		System.out.println("Enter an integer:");
		
		int i= readInteger();
		
		System.out.println("Print the number "+i);

	}
	
	static int readInteger()
	{
		return new Scanner(System.in).nextInt();
	}
	
	static Scanner getInput()
	{
		return new Scanner(System.in);
	}
	static int convertStringToInteger(String str)
	{
		try
		{
		if(str!=null)
		return Integer.parseInt(str);
		else
			return 0;
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"Please enter a valid input");
		}
		return 0;
	}
	
	
	
	static void fillArray(int ...ar)
	{
		 Arrays.fill(ar, 3, 4, 10);
		    
	        System.out.println(Arrays.toString(ar));

	}
	
	static void copyArray()
	{
		int a[]={10,20,30,40,50};
        int b[]=new int[a.length];
        
        //copying one array to another
        b=Arrays.copyOf(a,a.length);
        
        
      //printing array
        for(int i=0;i<b.length;++i){
            System.out.print(b[i]+" ");
        }

System.out.println();
	}
	
	
	static void copyArrayUsingClone()
	{
		int a[]={10,20,30,40,50};
        int b[]=new int[a.length];
        
        //copying one array to another
        b=a.clone();
        
        //printing array
        for(int i=0;i<b.length;++i){
            System.out.print(b[i]+" ");
        }
        System.out.println();
	}
	
	static void copyArrayUsingArrayCopy()
	{
		int a[]={10,20,30,40,50};
        int b[]=new int[a.length];
        
        //copying one array to another
        System.arraycopy(a,0,b,0,a.length);
        
        //printing array
        for(int i=0;i<b.length;++i){
            System.out.print(b[i]+" ");
        }
        System.out.println();
	}
	
	

}
