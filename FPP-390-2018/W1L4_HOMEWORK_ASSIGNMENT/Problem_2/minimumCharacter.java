package Problem_2;

public class minimumCharacter {

	public static void main(String[] args) {
		System.out.println(minimum("akel"));
	}

	public static char minimum(String str1) {
		char ch = str1.charAt(0);
		if (str1 == null || str1.length() == 0) {
			System.out.println("Empty String.");
		}
		if (str1.length() == 1) {
			return ch;
		} else {
			if (ch < minimum(str1.substring(1))) {
				return ch;
			} else {
				return minimum(str1.substring(1));
			}

		}
	}

}
/*Output
 * a
 */
