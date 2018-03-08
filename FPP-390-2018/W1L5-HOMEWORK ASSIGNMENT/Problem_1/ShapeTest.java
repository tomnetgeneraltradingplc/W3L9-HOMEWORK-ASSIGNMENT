package Problem_1;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shapeList = new Shape[5];
		shapeList[0] = new Rectangle("RED", 5.3, 60.1);
		shapeList[1] = new Circle("Black", 43.2);
		shapeList[2] = new Square("YELLO", 9.5);
		shapeList[3] = new Rectangle("BROWN", 10.2, 6.6);
		shapeList[4] = new Circle("GREEN", 23.3);
		printTotal(shapeList);
	}

	public static void printTotal(Shape[] shapeList) {
		double totalArea = 0.0;
		double totalPerimeter = 0.0;
		for (Shape s : shapeList) {
			totalArea += s.calculateArea();
			totalPerimeter += s.calculatePerimeter();
		}
		System.out.println("Total Area: " + totalArea);
		System.out.println("Total Perimeter: " + totalPerimeter);
	}
}
/*Output
Total Area: 8044.605109542777
Total Perimeter: 620.2318229274425
*/