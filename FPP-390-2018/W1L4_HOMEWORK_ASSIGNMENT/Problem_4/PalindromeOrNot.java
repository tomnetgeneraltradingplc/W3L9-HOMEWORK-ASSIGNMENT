package Problem_4;

import java.util.Scanner;

public class PalindromeOrNot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String();
		System.out.println("Enter a String to check Palindrome or Not? ");
		Scanner scanner = new Scanner(System.in);

		str1 = scanner.nextLine();

		if (isPalindrome(str1)) {
			System.out.println("IS the String \"" + str1 + "\" is Palindrome: " + isPalindrome(str1));
		} else {
			System.out.println("IS the String \"" + str1 + "\" is Palindrome: " + isPalindrome(str1));

		}
		scanner.close();
	}

	public static boolean isPalindrome(String str1) {

		// base case
		if (str1 == "" || str1.length() <= 1) {

			return true;// Empty string is palindrome

		}
		// check first character and last character are the same
		if (str1.charAt(0) != str1.charAt(str1.length() - 1)) {

			return false;
		} else {
			// recursive case

			return isPalindrome(str1.substring(1, str1.length() - 1));

		}

	}

}
/*
 * Enter a String to check Palindrome or Not? 
 * madam 
 * IS the String "madam" is Palindrome: true
 * 
 * Enter a String to check Palindrome or Not? 
 * Maharishi
 * IS the String "Maharishi" is Palindrome: false
 */
