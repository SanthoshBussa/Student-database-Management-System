package controllor_dao;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import model_dto.Student;
import sortBy.SortByName;

public class StudentDao implements Student_Dao {

	// Database
	LinkedHashMap<Integer, Student> db = new LinkedHashMap<Integer, Student>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addStudent() {
		System.out.println("Enter student name");
		String name = sc.next();
		System.out.println("Enter student age");
		int age = sc.nextInt();
		System.out.println("Enter student marks");
		double marks = sc.nextDouble();
		Student student = new Student(name, age, marks);
		// Storing student inside DB
		db.put(student.getSid(), student);
		System.out.println("Student added sucessfully");
	}

	@Override
	public void searchStudent() {
		System.out.println("Enter SID");
		int sid = sc.nextInt();

		if (db.containsKey(sid)) {
			Student s = db.get(sid);
			System.out.println(s);
		} else {
			// Custom exception
			System.out.println("Student not found");
		}
	}

	@Override
	public void displayAllStudents() {

		Set<Integer> s = db.keySet();

		for (Integer ele : s) {
			System.out.println(db.get(ele));
		}
	}

	@Override
	public void removeStudent() {
		System.out.print("Enter Student Id: ");
		int sid = sc.nextInt();
		if (db.containsKey(sid)) {
			System.out.println(db.get(sid));
			System.out.print("Confirm to remove student :");
			String choice = sc.next();
			if (choice.toLowerCase().equals("confirm")) {
				db.remove(sid);
				System.out.println("Sucessfully Removed");
			} else
				System.out.println("Student Not Removed");
		} else
			System.out.println("Student Not Found");
	}

	@Override
	public void countStudent() {
		System.out.println("The total no.of Students is: " + db.size());

	}

	@Override
	public void sortStudent() {
		TreeSet<Student> t = new TreeSet<Student>(new SortByName());

		Set<Integer> s = db.keySet();
		for (Integer i : s) {
			t.add(db.get(i));
		}
		for (Student i : t) {
			System.out.println(i);
		}
	}

	@Override
	public void updateStudentMarks() {
		System.out.println("Enter SID");
		int sid = sc.nextInt();
		if (db.containsKey(sid)) {
			Student s = db.get(sid);
			System.out.print("Old marks: " + s.getMarks());
			System.out.print("Enter new marks: ");
			double marks = sc.nextDouble();
			s.setMarks(marks);
			System.out.println("Marks is updated");
			System.out.println(s);
		} else {
			System.out.println("Student Not Found");
		}

	}

}
