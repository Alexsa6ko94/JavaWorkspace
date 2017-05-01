package javaExams;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BitSifting {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		BigInteger num1 = input.nextBigInteger();
		int n = input.nextInt();
		BigInteger result = num1;

		for (int i = 0; i < n; i++) {
			BigInteger temp = input.nextBigInteger();
			result = result.andNot(temp);
		}

		System.out.println(result.bitCount());


	}

}
