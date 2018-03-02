package Problem_1;

public class Prog1 {
	public static void main(String[] args) {

		int x = RandomNumbers.getRandomInt(1, 9);
		System.out.println("Random value of X in the range of 1 to 9 ===> " + x);
		Double computedX = Math.pow(Math.PI, x);
		System.out.println("The Computed value of π the power of X = " + computedX);
		System.out.println();

		int y = RandomNumbers.getRandomInt(3, 14);
		System.out.println("Random value of Y in the range of 3 to 14 ===> " + y);
		Double computedY = Math.pow(y, Math.PI);
		System.out.println("The Computed value of Y the power of π = " + computedY);
	}
}
/*
 * Output 
 * Random value of X in the range of 1 to 9 ===> 9 
 * The Computed value of π the power of X = 29809.0993334462
 * 
 * Random value of Y in the range of 3 to 14 ===> 3 
 * The Computed value of Y the power of π = 31.54428070019754
 * 
 */
