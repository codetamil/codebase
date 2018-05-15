package overloading;

public class AdditionService {
	
	static int add(int a,int b)
	{
		System.out.println("I am here");
		return a+b;
	}
	static float add(float a,float b)
	{
		System.out.println("Float I am");
		return a+b;
	}
	static int add(char a,char b)
	{
		return a+b;
	}
	
	static String add(String a,String b)
	{
		return a+b;
	}
	
	static long  add(long a,long b)
	{
		System.out.println("Hi");
		return a+b;
	}
	
	static short  add(short a,short b)
	{System.out.println("short");
		return (short)(a+b);
	}
	AdditionService()
	{
		System.out.println("Hi");
	}
	AdditionService(float s,float t)
	{
		System.out.println(s+t);
	}
	AdditionService(int a,int b)
	{
		System.out.println(a+b);
	}
	AdditionService(char a,char b)
	{
		System.out.println(a+b);
	}
	AdditionService(long a,long b)
	{
		System.out.println(a+b);
	}
	AdditionService(String a,String b)
	{
		System.out.println(a+b);
	}
	AdditionService(short a,short b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String args[])
	{
		long a=1;
		long b=2;
		System.out.println(add(a,b));
	}

}
