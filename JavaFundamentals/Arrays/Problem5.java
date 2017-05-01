package arrays;

import java.util.Arrays;

public class Problem5 {

	public static void main(String[] args) {
		
		int[] arr = {2, 1, 1, 1, 1, 1, 2, 3, 4, 3, 3, 3, 3, 3, 1, 5,5,5,5,5,5,5,5};
		
		int biggestSeqCount = 1;
		int tempCount = 1;
		
		int num = 0;
		
		for (int i = 0; i < arr.length - 1; i++) {
			
			if (arr[i] < arr[i+1]) {
				tempCount++;
				if (tempCount > biggestSeqCount) {
					biggestSeqCount = tempCount;
					num = i + 1;
				}
			} else {
				if (tempCount > biggestSeqCount) {
					biggestSeqCount = tempCount;
					num = i + 1;
				}
				tempCount = 1;
			}
			
		}
		
		int[] result = Arrays.copyOfRange(arr, num - biggestSeqCount + 1, num + 1);
		
		System.out.printf("Biggest: %d%nNum: %d%n", biggestSeqCount, num);
		
		System.out.println(Arrays.toString(result));
	}

}