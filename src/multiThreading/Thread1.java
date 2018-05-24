package multiThreading;

public class Thread1 extends Thread {
	
	
	public Thread1()
	{
		//t= new Thread(this,"First Thread");
		setPriority(7);
		//t.start();
		//t.
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(2000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	

}
