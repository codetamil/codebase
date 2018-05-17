package exceptionHandling;

public class test {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[99999999];
			System.out.println("test");
		}
		// TODO Auto-generated method stub
catch(Error e){
	System.out.println("Catch block");
}
	}

}
