package Day2_Problem_3;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static List<Student> convertArray(Object[] studentArray) {
		/* implement */
		List<Student> studentList = new ArrayList<>();
		for(Object o:studentArray){
			Student s = (Student) o;
			studentList.add(s);
		}
		
		return studentList;
	}
	
	
	public static double computeAverageGpa(List<Student> studentList) {
		/*implement */
		double avGPA=0.0;
		if(studentList.isEmpty()) return 0.0;
		for(Student s : studentList){
			avGPA = avGPA + s.computeGpa();
		}
		avGPA=avGPA/studentList.size();
		return avGPA;
	}
}
