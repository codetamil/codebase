package test;
import java.util.*;

import com.*;

public class Main {
	public static void main(String[] args) {
		

Scanner sc=new Scanner(System.in);
int id=sc.nextInt();
String items=sc.next();
String catagory=sc.next();
double price=sc.nextDouble();
int quantity=sc.nextInt();
Menu m=new Menu(id,items,catagory,price,quantity);
System.out.println(m.getId());
System.out.println(m.getItems());
System.out.println(m.getCategories());
System.out.println(m.getPrice());
System.out.println(m.getQuantity());

}
}