package javaExams;

import java.util.Scanner;

public class NewHouse {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int roofHeight =  n/2;
		int mid = n/2;
		
		for (int i = 0; i < roofHeight + n; i++) {
			for (int j = 0; j < n; j++) {
				if (i < roofHeight && (j > mid+i || j < mid-i)) {
					System.out.print("-");
				}
				else if (i > roofHeight && (j == 0 || j == n-1 )) {
					System.out.print("|");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
	}

}
