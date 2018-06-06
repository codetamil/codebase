package comparatorcomparablexamaple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareStudent {
	public static void main(String args[]) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(05, 86, "B"));
		list.add(new Student(02, 46, "F"));
		list.add(new Student(10, 33, "S"));
		list.add(new Student(11, 72, "V"));
		
		Collections.sort(list);
		System.out.println("Comparable----Sorted by Marks-----");
		for(Student student:list)
			System.out.println("Name:"+student.getName()+
					"\tID:"+student.getId()+
					"\tMarks:"+student.getMarks());
		
		/*System.out.println("Comparator----Sorted by Name-----");
		NameStudent nameStudent = new NameStudent();
		Collections.sort(list, nameStudent);
		for(Student student:list)
			System.out.println("Name:"+student.getName()+
					"\tID:"+student.getId()+
					"\tMarks:"+student.getMarks());
		
		System.out.println("Comparator----Sorted by ID-----");
		NameStudent idStudent = new NameStudent();
		Collections.sort(list, idStudent);
		for(Student student:list)
			System.out.println("Name:"+student.getName()+
					"\tID:"+student.getId()+
					"\tMarks:"+student.getMarks());*/
	}
}
