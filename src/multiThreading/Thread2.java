package multiThreading;

public class Thread2 extends Thread{
	
	public Thread2()
	{setPriority(5);
		//Thread2 t2 = new Thread2();
		//start();
	}
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		
				try {
					Thread.sleep(2000);
					System.out.println("Thread 2 ");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		
		}
	}
	//complete the code

}
