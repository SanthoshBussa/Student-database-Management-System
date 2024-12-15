package model_dto;

public class Student {

	private String name;
	private int sid;
	private int age;
	private double marks;
	static int id = 101;

	public Student(String name, int age, double marks) {
		this.name = name;
		this.age = age;
		this.marks = marks;
		sid = id;
		id++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSid() {
		return sid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sid=" + sid + ", age=" + age + ", marks=" + marks + "]";
	}

	@Override
	public boolean equals(Object o) {
		Student s = (Student) o;
		return this.sid == s.sid;
	}

	@Override
	public int hashCode() {
		return sid;
	}
}