package Problem_8;

public class Prog8 {

	public static void main(String[] args) {
		int[] number = { 2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22 };
		int miniNumber = number[0];
		for (int i = 0; i < number.length - 1; i++) {
			if (number[i + 1] < miniNumber) {
				miniNumber = number[i + 1];
			}
		}
		System.out.println("The minimum number is: " + miniNumber);
	}

}
/*Output
* The minimum number is: -21
*/