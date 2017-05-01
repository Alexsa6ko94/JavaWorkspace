package arrays;

import java.util.Arrays;

public class Problem6 {

	public static void main(String[] args) {
		int k = 3;
		int[] arr = { 1, 2, 5 ,3 ,0 ,0 ,1 ,4 };
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, arr.length - k, arr.length)));
		
		
	}

}