package operatorsAndExprs;

import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		int thirdDigit = (num / 100) % 10;
		
		boolean isSevenThirdDigit = thirdDigit == 7;
		
		System.out.println(isSevenThirdDigit);
	}

}
