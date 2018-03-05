package Problem_5;

import static org.junit.Assert.*;

import org.junit.Test;

import Problem_2.minimumCharacter;
import Problem_4.PalindromeOrNot;

public class myTestCase {

	@Test
	// Test case 1 to check minimum character functionality
	public void test1MinimumChar() {
		String inputString = "akel";
		char output = minimumCharacter.minimum(inputString);
		char expectedOutput = 'a';
		assertEquals(output, expectedOutput);
	}

	@Test
	// Test case 2 to check a string palindrome or not functionality
	public void test2CheckPalindromeOrNot() {
		String inputString = "Maharishi";
		boolean Ooutput = PalindromeOrNot.isPalindrome(inputString);
		boolean expectedOutput = false;
		assertEquals(Ooutput, expectedOutput);
	}

}
