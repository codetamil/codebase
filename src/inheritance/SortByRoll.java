package inheritance;

import java.util.Comparator;

public class SortByRoll  implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		// TODO Auto-generated method stub
		return a.rollno-b.rollno;
	}

}
