package primitiveTypesAndVars;

import java.sql.Blob;

public class Problem_10 {

	public static void main(String[] args) {
		int a = 3;
		int b = 8;
		
//		a ^= b;
//		b ^= a;
//		a ^= b;
		
		a += b; // a = 5
		b = a - b; // b = 10
		a -= b; // a =
		
		System.out.println("a: " + a + "\nb: " + b);
		
	}

}
