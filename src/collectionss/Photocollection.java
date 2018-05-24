package collectionss;

import java.util.Iterator;
import java.util.Stack;

public class Photocollection {

	public static void main(String[] args)
	{
		Stack<Integer> s=new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		
		System.out.println(s);
		/*Iterator i1=s.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());

		}*/
		for(int x:s)
		{
			System.out.println(x);
		}
		System.out.println(s.toString());
		
	}
}
