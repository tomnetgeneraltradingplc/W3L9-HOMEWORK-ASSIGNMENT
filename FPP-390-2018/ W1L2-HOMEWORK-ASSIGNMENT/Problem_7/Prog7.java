package Problem_7;

public class Prog7 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < args.length; ++i) {
			System.out.println("Length of index " + i + " " + args[i] + " = " + args[i].length());
			if (args[i].startsWith("A")) {
				count++;
			}
		}
		System.out.println("\nNumber of strings begin by A is = " + count);
	}

}
/*
Length of index 0 This = 4
Length of index 1 is = 2
Length of index 2 FPP-390 = 7
Length of index 3 course, = 7
Length of index 4 In = 2
Length of index 5 this = 4
Length of index 6 course, = 7
Length of index 7 you = 3
Length of index 8 will = 4
Length of index 9 learn = 5
Length of index 10 new = 3
Length of index 11 programming = 11
Length of index 12 ideas = 5
Length of index 13 and = 3
Length of index 14 concepts. = 9
Length of index 15 As = 2
Length of index 16 we = 2
Length of index 17 know = 4
Length of index 18 java = 4
Length of index 19 is = 2
Length of index 20 the = 3
Length of index 21 best = 4
Length of index 22 programming = 11
Length of index 23 language = 8
Length of index 24 currently. = 10
Length of index 25 Apply = 5
Length of index 26 for = 3
Length of index 27 this = 4
Length of index 28 course = 6

Number of strings begin by A is = 2
 */