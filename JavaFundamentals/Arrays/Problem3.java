package arrays;

import java.util.Arrays;

public class Problem3 {

	public static void main(String[] args) {
		
		char[] ch1 = {'a', 'b', 'c'};
		char[] ch2 = {'a', 'b', 'c'};
		
		String earlier = "None";
		
		for (int i = 0; i < ch1.length; i++) {
			if(ch1[i] == ch2[i]) continue;
			
			if ((int)ch1[i] > (int)ch2[i]) {
				earlier = "Second";
				break;
			}else {
				earlier = "First";
				break;
			}
		}
		System.out.println(earlier);
	}

}