package test;

import java.util.Scanner;

import util.GstCalc;

import com.Customer;
import com.Menu;
import com.Order;


public class TestHotel {
	public static void main(String[] args) {
		Menu m1=new Menu(5,"Mango","fruit",45.50,6);
		Order o1=new Order(5,"Arushi", 45, 56,m1 );
		Scanner sc=new Scanner(System.in);
		Customer c=new Customer();
		c.setEmailID(sc.next());
		c.setId(sc.nextInt());
		c.setName(sc.next());
		c.setOrder(o1);
		c.setPhoneNumber(100);
		GstCalc g=new GstCalc();
		double gst=g.calc(c.getOrder().getBill());
		double totalbill= c.getOrder().getBill()+gst;
		System.out.println(c.getEmailID());
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(totalbill);
		System.out.println(c.getPhoneNumber());
		
	}

}
