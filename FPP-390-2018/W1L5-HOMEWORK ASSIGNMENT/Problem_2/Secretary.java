package Problem_2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{
private double overtimeHours;

public Secretary(String name, double salary, LocalDate hireDate) {
	super(name, salary, hireDate);
	
}

public double getOvertimeHours() {
	return overtimeHours;
}

public void setOvertimeHours(double overtimeHours) {
	this.overtimeHours = overtimeHours;
}

@Override
public double computeSalary() {
	return super.computeSalary() + (12 * overtimeHours);
}

@Override
public String toString() {
	return "Secretary [Name=" + getName() + ", Hire Date=" + getHireDate()
	+ ", Salary=" + computeSalary() + ", Overtime Hours=" + overtimeHours + "]";
}

}
