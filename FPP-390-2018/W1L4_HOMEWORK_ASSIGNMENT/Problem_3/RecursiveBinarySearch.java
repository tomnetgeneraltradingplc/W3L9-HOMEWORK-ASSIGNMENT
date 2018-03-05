package Problem_3;

import java.util.Arrays;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] theArray = { 0, 5, 99, 40, 61, 10, 32, 200, 3, 55, 66 };
		System.out.println("Original array: " + Arrays.toString(theArray));
		// theArray must be sorted
		Arrays.sort(theArray);

		System.out.println("Sorted array: " + Arrays.toString(theArray));

		// print of the position of the target in a sorted array

		System.out.println("Index Position of the target in the sorted array:  " + recursiveBinarySearch(theArray, 66));

	}

	static int recursiveBinarySearch(int[] myArray, int target) {
		System.out.println("Your target is: " + target);
		return binarySearch(myArray, target, 0, myArray.length - 1);

	}

	// Helper method
	private static int binarySearch(int[] a, int myTarget, int lowerBound, int upperBound) {
		if (lowerBound > upperBound)
			return -1;
		int midValue = (lowerBound + upperBound) / 2;
		if (a[midValue] == myTarget)
			return midValue;
		else if (a[midValue] < myTarget)
			// perform binary search to the right of mid
			return binarySearch(a, myTarget, midValue + 1, upperBound);

		else
			// perform binary search to the left of mid
			return binarySearch(a, myTarget, lowerBound, midValue - 1);

	}

}
/*
Original array: [0, 5, 99, 40, 61, 10, 32, 200, 3, 55, 66]
Sorted array: [0, 3, 5, 10, 32, 40, 55, 61, 66, 99, 200]
Your target is: 66
Index Position of the target in the sorted array:  8
*/