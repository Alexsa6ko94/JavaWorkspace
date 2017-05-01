package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		
		System.out.println("Enter first array elements in format: 1, 2, 3, 4...");
		String[] firstArr = input.nextLine().split(",\\p{javaSpaceChar}*");
		
		System.out.println("Enter second array elements in format: 1, 2, 3, 4...");
		String[] secondArr = input.nextLine().split(",\\p{javaSpaceChar}*");
		
		boolean areEquals = Arrays.equals(firstArr, secondArr);
		
		System.out.println("Equals: " + areEquals);
		
	}

}