package inheritance;

public class Cat extends Animal {
	
	public void createObject()
	{
		
		
		move();
	}
	public static void main(String args[])
	{
		PussyCat obj1=new PussyCat();
	obj1.feedFood();
	obj1.a();
	Animal obj3=new Animal();
	obj3.move();
	}
	
}
