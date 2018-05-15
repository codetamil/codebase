package inheritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;

public class TopicTrackerImpl extends TopicTracker {

	List listOfTopics = new ArrayList();
	Scanner obj= new Scanner(System.in);
	@Override
	List listOfTopics() {
		// TODO Auto-generated method stub
		
		listOfTopics.add("Exception Handling");
		listOfTopics.add("Multi Threading");
		listOfTopics.add("JDBC");
		listOfTopics.add("SQL");
		listOfTopics.add("Inheritance");
		return listOfTopics;
	}
	void  checkStatus()
	{
		String status;
	
		Iterator itr= listOfTopics().iterator();
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		
			
			
			System.out.println("Enter status:");
			status = obj.next();
			obj.nextLine();
			
			
		//	System.out.println(++count);
		}
	}
public static void main(String []args) throws Exception
{
	
	TopicTrackerImpl obj=new TopicTrackerImpl();
	
//	System.out.println(obj.listOfTopics());
	//System.out.println("Is all done");
//	String response=br.readLine();
	
	obj.checkStatus();	
	
}
}
