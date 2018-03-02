package Problem_2;

public class Prog2 {

	public static void main(String[] args) {
		float num1 = 1.27f;
		float num2 = 3.881f;
		float num3 = 9.6f;

		int sum1 = (int) (num1 + num2 + num3);
		System.out.println("The sum of the floats as Integer by Casting = " + sum1);
		System.out.println("");

		int sum2 = Math.round(num1 + num2 + num3);
		System.out.println("The sum of the floats as Integer by Rounding = " + sum2);

	}

}
/*
 * Output 
 * The sum of the floats as Integer by Casting = 14
 * 
 * The sum of the floats as Integer by Rounding = 15
 * 
 */
