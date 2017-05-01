package primitiveTypesAndVars;

public class Problem_5 {

	public static void main(String[] args) {
		
		String hello = "hello";
		String word = "word";
		
		Object concat = hello + " " + word;
		System.out.println(concat);
		
		String str = (String)concat;
		System.out.println(str);
		
	}

}
