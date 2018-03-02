package Problem_4;

import java.util.Scanner;

public class FigureTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter C for Circle \n" + "Enter R for Rectangle \n" + "Enter T for Triangle \n");

		String answer = scanner.nextLine();
		switch (answer.toUpperCase()) {
		case "C": {
			System.out.println("Enter the radius: ");
			double radius = scanner.nextDouble();
			Circle circle = new Circle(radius);
			System.out.println("Area of Circle is = " + circle.computeArea());
			break;
		}
		case "R": {
			System.out.println("Enter the width: ");
			double width = scanner.nextDouble();
			System.out.println("Enter the length: ");
			double length = scanner.nextDouble();
			Rectangle rectangle = new Rectangle(width, length);
			System.out.println("Area of Rectangle is = " + rectangle.computeArea());
			break;
		}
		case "T": {

			System.out.println("Enter the base: ");
			double base = scanner.nextDouble();
			System.out.println("Enter the height : ");
			double height = scanner.nextDouble();
			Triangle triangle = new Triangle(base, height);
			System.out.println("Area of Triangle is = " + triangle.computeArea());
			break;
		}
		default:
			System.out.println("Invalid Input");
			break;
		}
		scanner.close();
	}

}
/*Enter C for Circle 
Enter R for Rectangle 
Enter T for Triangle 

c
Enter the radius: 
6.3
Area of Circle is = 124.68981242097887

*/