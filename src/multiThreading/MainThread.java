package multiThreading;

public class MainThread {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Thread1 th= new Thread1();
		Thread2 th1= new Thread2();
		Thread3 th3=new Thread3();
		th.start();
		th1.start();
		th3.start();
		//th3.setPriority(1);
//		th3.averageFinder();
	}

}
