package Problem_5;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class MyDate {
	LocalDate mydate;

	MyDate(int m, int d, int y) {
		mydate = LocalDate.of(y, m, d);
	}

	MyDate(String M, int d, int y) {
		int m = Month.valueOf(M.toUpperCase()).getValue();
		mydate = LocalDate.of(y, m, d);
	}

	MyDate(int D, int y) {
		mydate = LocalDate.ofYearDay(y, D);
	}

	public void returnDate(){
	System.out.println("MM/dd/yyyy: " +mydate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
	System.out.println("MMMM dd,yyyy:"+mydate.format(DateTimeFormatter.ofPattern("MMMM dd,yyyy")));
	System.out.println("DDD yyyy:"+mydate.format(DateTimeFormatter.ofPattern("DDD yyyy")));
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='y';
		while(ch=='y'||ch=='Y'){
		System.out.println("Enter 1 for format: MM/DD/YYYY");
		System.out.println("Enter 2 for format: Month DD, YYYY");
		System.out.println("Enter 3 for format: DDD YYYY");
		System.out.println("Enter 4 to exit");
		MyDate myDate;
		System.out.println("Choose your Choice :");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		int m, d, y, D;
		String M;
		System.out.println("Choice: " + choice);
		switch (choice) {
		case 1:
			System.out.println("Enter Month:");
			m = in.nextInt();
			System.out.println("Enter Day:");
			d = in.nextInt();
			System.out.println("Enter Year:");
			y = in.nextInt();
			myDate = new MyDate(m, d, y);
			myDate.returnDate();
			break;
		case 2:
			System.out.println("Enter Month in text:");
			M = in.next();
			System.out.println("Enter Day:");
			d = in.nextInt();
			System.out.println("Enter Year:");
			y = in.nextInt();
			myDate = new MyDate(M, d, y);
			myDate.returnDate();
			break;
		case 3:
			System.out.println("Enter Day of Year:");
			D = in.nextInt();
			System.out.println("Enter Year:");
			y = in.nextInt();
			myDate = new MyDate(D, y);
			myDate.returnDate();
			break;
		default:
			System.out.println("Wrong choice");
		}
		System.out.println("Do you want to Continue :");
		ch = in.next().charAt(0);
	}
		System.out.println("Terminated");
	}
}
/*
 * Enter 1 for format: MM/DD/YYYY
Enter 2 for format: Month DD, YYYY
Enter 3 for format: DDD YYYY
Enter 4 to exit
Choose your Choice :
1
Choice: 1
Enter Month:
12
Enter Day:
28
Enter Year:
2015
MM/dd/yyyy: 12/28/2015
MMMM dd,yyyy:December 28,2015
DDD yyyy:362 2015
Do you want to Continue :
y
Enter 1 for format: MM/DD/YYYY
Enter 2 for format: Month DD, YYYY
Enter 3 for format: DDD YYYY
Enter 4 to exit
Choose your Choice :
2
Choice: 2
Enter Month in text:
January
Enter Day:
26
Enter Year:
2004
MM/dd/yyyy: 01/26/2004
MMMM dd,yyyy:January 26,2004
DDD yyyy:026 2004
Do you want to Continue :
y
Enter 1 for format: MM/DD/YYYY
Enter 2 for format: Month DD, YYYY
Enter 3 for format: DDD YYYY
Enter 4 to exit
Choose your Choice :
3
Choice: 3
Enter Day of Year:
221
Enter Year:
2016
MM/dd/yyyy: 08/08/2016
MMMM dd,yyyy:August 08,2016
DDD yyyy:221 2016
Do you want to Continue :
n
Terminated

 */
