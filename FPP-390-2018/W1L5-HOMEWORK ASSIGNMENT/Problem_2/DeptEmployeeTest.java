package Problem_2;

import java.time.LocalDate;

import java.util.Scanner;

public class DeptEmployeeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Professor p1 = new Professor("Thomas", 6500, LocalDate.of(2010, 6, 17));
		Professor p2 = new Professor("Jone", 5000, LocalDate.of(2012, 6, 17));
		Professor p3 = new Professor("Smith", 3000, LocalDate.of(2015, 6, 17));
		Secretary s1 = new Secretary("Anne", 1700, LocalDate.of(2013, 6, 17));
		Secretary s2 = new Secretary("Malla", 2300, LocalDate.of(2017, 6, 17));
		p1.setNumOfPublications(12);
		p2.setNumOfPublications(10);
		p3.setNumOfPublications(5);
		s1.setOvertimeHours(60.5);
		s2.setOvertimeHours(45.90);
		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = p1;
		department[1] = p2;
		department[2] = p3;
		department[3] = s1;
		department[4] = s2;
		System.out.println("This is the Employee list!");
		System.out.println("====================================");
		for (DeptEmployee e : department) {
			System.out.println(e);
		}
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Did you wish to see the sum of all Professor,Secretary and Department salary? ");
		String answer = scanner.nextLine().toUpperCase();
		char ch = answer.charAt(0);

		if (ch == 'Y') {
			double totalSalary = 0.0;
		
			for (DeptEmployee d : department) {
				totalSalary += d.computeSalary();
			
			}
			System.out.println("Total Salary is: " + totalSalary);
			
		} else {
			System.out.println("Good Bye!");
		}
		scanner.close();
	}

}
/*Output
This is the Employee list!
====================================
Professor [Name =Thomas, Hire Date=2010-06-17, Salary=6500.0, numOfPublications=12]
Professor [Name =Jone, Hire Date=2012-06-17, Salary=5000.0, numOfPublications=10]
Professor [Name =Smith, Hire Date=2015-06-17, Salary=3000.0, numOfPublications=5]
Secretary [Name=Anne, Hire Date=2013-06-17, Salary=2426.0, Overtime Hours=60.5]
Secretary [Name=Malla, Hire Date=2017-06-17, Salary=2850.8, Overtime Hours=45.9]
---------------------------------------------------------------------------------
---------------------------------------------------------------------------------
Did you wish to see the sum of all Professor,Secretary and Department salary? 
y
Total Salary is: 19776.8
*/