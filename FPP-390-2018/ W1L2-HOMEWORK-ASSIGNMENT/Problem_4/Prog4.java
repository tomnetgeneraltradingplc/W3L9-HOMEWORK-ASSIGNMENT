package Problem_4;

import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string? ");
		String str = scanner.nextLine();
		System.out.println("The original string that you ented: " + str);
		System.out.print("The Reversed string of the original: ");

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		scanner.close();
	}

}
/*
 * Output Enter a string? Hello 
 * The original string that you entered: Hello 
 * The Reversed string of the original: olleH
 */
