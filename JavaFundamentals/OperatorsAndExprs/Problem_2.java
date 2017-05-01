package operatorsAndExprs;

import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		boolean isDivBy5and7 = (num % 5 == 0 && num % 7 == 0);
		
		System.out.println(isDivBy5and7);
	}

}
