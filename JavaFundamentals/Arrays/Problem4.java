package arrays;

import java.util.Arrays;

public class Problem4 {

	public static void main(String[] args) {
		
		int[] arr = {2, 1, 1, 1, 1, 1, 2, 3, 3, 3, 3, 3, 3, 1, 5,5,5,5,5,5,5,5};
		
		int biggestSeqCount = 1;
		int tempCount = 1;
		
		int num = 0;
		
		for (int i = 0; i < arr.length - 1; i++) {
			
			if (arr[i] == arr[i+1]) {
				tempCount++;
				if (tempCount > biggestSeqCount) {
					biggestSeqCount = tempCount;
					num = arr[i];
				}
			} else {
				if (tempCount > biggestSeqCount) {
					biggestSeqCount = tempCount;
					num = arr[i];
				}
				tempCount = 1;
			}
			
		}
		
		System.out.printf("Biggest: %d%nNum: %d", biggestSeqCount, num);
		
	}

}