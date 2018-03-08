package Problem_2;

import java.time.LocalDate;

public class Professor extends DeptEmployee{
	private int numOfPublications;

public Professor(String name, double salary, LocalDate hireDate) {
	super(name, salary, hireDate);
	
}

public int getNumOfPublications() {
	return numOfPublications;
}

public void setNumOfPublications(int numOfPublications) {
	this.numOfPublications = numOfPublications;
}

@Override
public String toString() {
	return "Professor [Name =" + getName() + ", Hire Date="
			+ getHireDate() + ", Salary=" + computeSalary() + ", numOfPublications=" + numOfPublications + "]";
}

}
