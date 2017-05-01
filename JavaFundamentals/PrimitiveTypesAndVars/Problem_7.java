package primitiveTypesAndVars;

public class Problem_7 {

	public static void main(String[] args) {
		
		int base = 7;
		char symbol = '*';
		
		for (int i = 0; i <= base / 2; i++) {
			for (int j = 0; j < base; j++) {
				
				if ( j == base / 2 - i || j == base / 2 + i) {
					System.out.print(symbol);
				}else if (i == base / 2) {
					System.out.print(symbol);
				}
				else {
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
			
		}
		
	}

}
