package collectionss;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/*
 * Map is a key Value Pair.
 * It is an interface.
 * PhoneBook class will map phone numbers to Names
 * HashMap and TreeMap are implementations of Map Interface
 * 
 */


public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Hashtable<String,String> phoneBook = new Hashtable<String,String>();
		phoneBook.put("345453","AAA");
		phoneBook.put("456456","BBB");
		phoneBook.put("554645","CCC");
		phoneBook.put("6786767","DDD");
		phoneBook.put("546645","AAA");
		phoneBook.put("546645","ZZZ");
		//phoneBook.put(null,"WWW");
		
		
		System.out.println(phoneBook);
		
		Set ss=phoneBook.keySet();
		
		System.out.println(ss);
		
		System.out.println(phoneBook.get("546645"));

	}

}
