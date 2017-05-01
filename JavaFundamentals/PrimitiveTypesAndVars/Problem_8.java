package primitiveTypesAndVars;

public class Problem_8 {

	public static void main(String[] args) {
		
		int base = 9;  
		char symbol = 'o';
		
		System.out.println(base / 2);
		
		for (int i = 0; i < base; i++) {
			for (int j = 0; j < base; j++) {
				
				if ((i > 0 && i < base / 2 ) && (j == i + 1 || j == base - i - 2)) {
					System.out.print(symbol);
				}
				else if (i == 0 && (j == 1 || j == base - 2)) {
					System.out.print(symbol);
				}
				else if ((i > 0 && i < base / 2) && (j == 0 || j == base-1)) {
					System.out.print(symbol);
				}
				else if ( (i >= base / 2) && (j == i - base / 2) ) {
					System.out.print(symbol);
				}
				else {
					System.out.print("-");
				}	
			}
			System.out.println();
		}
	}
}
