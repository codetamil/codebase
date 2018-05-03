package com;

import java.util.Arrays;

import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Wece");
		
		
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	      // foreach loop
	      for (char item: vowels) {
	         System.out.print(" "+item);
	      }

	      int[]  num={23,45,67,78,89};
	      
	      for(int i:num)
	      {
	    	  System.out.println(i);
	      }*/
	    	  
	    	//System.out.println(factorial(5));	  
	    	//printStarsPattern(10,2);
	    	
	    //	System.out.println(findingLength(10001));
	    	
	    	
	    	//gettingInput();
	    	
	    	//printNumber(1);
	    	//printDivisorsSqrt(10);
	    	
	  //  	System.out.println(checkPrime(10));
		
	//	doCheckThis(10);
		
		
	//	findDifference(789);
		
	//	expression(3);
	//	System.out.println(findingGreaterOfThree(10,34,67));
		
	//	 System.out.println(findingTheMaximum(23,56,108,12,98));
		 
	//	 sortingDescendingOrder();
		
		/*
		 String  matrix[][] = { {"India","1000"  },
                 {"China","2000" },
                 {"Britain","2344" },
                 {"France","3454" } };
// Sort this matrix by 3rd Column
int col = 3;
sortbyColumn(matrix, col - 1);

// Display the sorted Matrix
for (int i = 0; i < matrix.length; i++) {
  for (int j = 0; j < matrix[i].length; j++)
      System.out.print(matrix[i][j] + " ");
  System.out.println();
}*/

		splittingStrings();
		

	}
	
	public static void splittingStrings()
	{
		int itr=0;
		Scanner ss= new Scanner(System.in);
		System.out.println("Enter no of Iteration:");
		int count=ss.nextInt();
		int arr[]= new int[2];
		while(itr<count)
		{
			System.out.println("Enter the value to be swapped...");
		String str=ss.nextLine();
		ss.nextLine();
		StringTokenizer strt= new StringTokenizer(str," ");
		
		int i=0;
		while(strt.hasMoreElements())
		{
			if(i<2)
			{
			String s=strt.nextToken();
			System.out.println(s);
			arr[i]=Integer.parseInt(s.trim());
			++i;
			}
			
			
		}
		itr++;
		swappingArray(arr[0],arr[1],"Yamaha","Bullet","Enfield","TVS");
		}
		
		
	}
	
	private static long factorial(int n)
	{
	    if (n==1)
	        return 1;
	    else
	        return n*factorial(n-1);
	}
	
	private static void printStarsPattern(int n, int i)
	{
		 // base condition
        if (n < 1)
            return;
         
        // to print the stars of 
        // a particular row
        if (i <= n)
        {
            System.out.print ( "* ");
             
            // recursively print rest  
            // of the stars of the row
            printStarsPattern(n, i + 1);
        } 
         
        else
        {
            // change line
            System.out.println( );
             
            // print stars of the 
            // remaining rows recursively
            printStarsPattern(n - 1, 1);
        }

	}
	
	
	
	
	static int findingLength(int number)
	{
		int length = 0;
		long temp = 1;
		while (temp <= number) {
		    length++;
		    temp *= 10; 
		}

		
		
		return length;
	}
	
	public static void printNumber(int number) {
				if(number <= 100) {
					System.out.print(" "+number);
					number++;
					printNumber(number);			//Note: method calling itself
				}else {
					System.exit(0);
				}
			}
	
	
	static void printDivisors(int n)
    {
        for (int i=1;i<=n;i++)
            if (n%i==0)
                System.out.printf("%d ",i);
    }

	static void printDivisorsSqrt(int n)
    {
        // Note that this loop runs till square root
        for (int i=1; i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                // If divisors are equal, print only one
                if (n/i == i)
                    System.out.printf("%d ", i);
      
                else // Otherwise print both
                    System.out.printf("%d %d ", i, n/i);
                
               
            }
        }
    }
	
	static boolean checkPrime(int num) {
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
	
	static void doCheckThis(int y)
	{
	
		for(int i=2; i <= (y / 2); i++)
		{
		    long z=y%i;
		    if(z!=0)continue;
		    System.out.print(i+" , ");
		}
	}

	static void findDifference(int num)
	{
		int rem=0,quo=0,dif=0,tempdif=0;
		while(num>0)
		{
			
			rem=num%10;
			quo=num/10;
			
			num=quo;
			
			dif=rem-dif;
			
			if(dif==1)
			tempdif=dif;
			else
				tempdif=((dif+(dif+1))/dif+1);
			
			
		}
		
		System.out.println(Math.abs(dif));

		if(Math.abs(dif)>=2)
		{
			
			System.out.println("Not a Funky number");
		}
		else
			
		System.out.println("Funky number");
		
	}
	
	
	public static void expression(int n)
	{
		int exp=0;
		int count=0,pow=1;
		int m=0;
		
		System.out.print("12 ");
		for(int i=0;i<n;i++)
		{
			if(m==0)
			{
				while(count!=2)
				{
		exp=(12*(int)Math.pow(2,pow))+((2 * m)+1)	;
		System.out.print(" "+exp);
		count++;
		++pow;
				}
				
			}
			
			++m;
			exp=(12*(int)Math.pow(2,pow))+((2 * m)+1)	;
			
			System.out.print(" "+exp);
			++pow;
		}
		
	}
	
	public static int findingGreaterOfThree(int a,int b,int c)
	{
		return (a>b)&&(a>c)?a:(b>c)?b:c;
	}
	
	public static int findingTheMaximum(int ...a)
	{
		
				int max = a[0];
				for(int i = 1; i < a.length;i++)
				{
					if(a[i] > max)
					{
						max = a[i];
					}
				}
				
			//	System.out.println("The Given Array Element is:");
				for(int i = 0; i < a.length;i++)
				{
					System.out.println(a[i]);
				}
				
			return max;

	}
	
	 public static void sortbyColumn(String arr[][], int col)
	    {
	        // Using built-in sort function Arrays.sort
	        Arrays.sort(arr, new Comparator<String[]>() {
	           
	          @Override             
	          // Compare values according to columns
	          public int compare(final String[] entry1, 
	                             final String[] entry2) {
	 
	            // To sort in descending order revert 
	            // the '>' Operator
	            if (Integer.parseInt(entry1[col]) > Integer.parseInt(entry2[col]))
	                return 1;
	            else
	                return -1;
	          }
	        });  // End of function call sort().
	    }

	
	
	public static void sortingDescendingOrder()
	{
		int n, temp;

		        Scanner s = new Scanner(System.in);

		        System.out.print("Enter no. of elements you want in array:");

		        n = s.nextInt();

		        int a[] = new int[n];

		        System.out.println("Enter all the elements:");

		        for (int i = 0; i < n; i++) 

		        {

		            a[i] = s.nextInt();

		        }

		        for (int i = 0; i < n; i++) 

		        {

		            for (int j = i + 1; j < n; j++) 

		            {

		                if (a[i] < a[j]) 

		                {

		                    temp = a[i];

		                    a[i] = a[j];

		                    a[j] = temp;

		                }

        }

		        System.out.print("Descending Order:");

		        for (int ii = 0; ii < n - 1; ii++) 

		        {

		            System.out.print(a[ii] + ",");
		           

		        }

		        System.out.print(a[n - 1]);


	}
		        

	}
	
	static void swappingArray(int p1,int p2,String ...arr)
	{
		String temp=null;
	
		
		
			
			temp=arr[p1];
			arr[p1]=arr[p2];
			
			arr[p2]=temp;
		//	System.out.println(arr[p2]);
			
		
		
		for(String s:arr)
		{
			System.out.println(s);
		}
	}
}
