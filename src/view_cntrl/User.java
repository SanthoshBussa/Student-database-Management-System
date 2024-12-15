package view_cntrl;
import controllor_dao.Student_Dao;
import controllor_dao.StudentDao;
import model_dto.Student;
public class User {

	public static void main(String[] args) {
		Student_Dao s=new StudentDao();
		s.addStudent();
		s.addStudent();
		s.displayAllStudents();
		s.removeStudent();
		s.displayAllStudents();
	}
}
