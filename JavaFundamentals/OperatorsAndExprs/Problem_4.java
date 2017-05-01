package operatorsAndExprs;

import java.util.Scanner;

public class Problem_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int mask = 1;
		
		if (((mask << 2) & num) == 0) {
			System.out.println("Third bit is: 0");
		}else {
			System.out.println("Third bit is: 1");
		}
	}
}
