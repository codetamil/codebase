package comparatorcomparablexamaple;

public class Student implements Comparable<Student> {
	int id;
	int marks;
	String name;
	
	public int getId() {
		return id;
	}

	public int getMarks() {
		return marks;
	}

	public String getName() {
		return name;
	}
	
	public Student(int id, int marks, String name) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
	}
	
	public int compareTo(Student s) {
		return this.marks - s.marks;
	}
}
