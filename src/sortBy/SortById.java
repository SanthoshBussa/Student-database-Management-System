package sortBy;
import java.util.Comparator;

import model_dto.Student;

public class SortById implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o1.getSid(), o2.getSid());
	}
	
	
	
}