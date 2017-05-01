package javaExams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MagicStrings{ 

	public static Map<String, Integer> leftSide = new HashMap<String, Integer>();
	public static Map<String, Integer> rightSide = new HashMap<String, Integer>();

	public static void printSeqc(Map<String, Integer> left, Map<String, Integer> right, int dif){
		
		for(Map.Entry<String, Integer> e : left.entrySet()){
		    for(Map.Entry<String, Integer> k : right.entrySet()) {
		    	if (Math.abs(e.getValue() - k.getValue()) == dif) {
					System.out.println(""+ e.getKey() + k.getKey()); 
				}	
		    }
		}
	}
	
	public static void generateSeqc(){

		String[] chars = {"k","s","n","p"};
		int[] weight = {1, 3, 4, 5};

		for (int i = 0; i < 4; i++) {
		    for (int j = 0; j < 4; j++) {
			for (int k = 0; k < 4; k++) {
			    for (int l = 0; l < 4; l++) {
				leftSide.put(chars[i] + chars[j] + chars[k] + chars[l], weight[i] + weight[j] + weight[k] + weight[l]);
				rightSide.put(chars[i] + chars[j] + chars[k] + chars[l], weight[i] + weight[j] + weight[k] + weight[l]);
			    }
			}
		    }
		}
	}
	
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int diff = input.nextInt();

		generateSeqc();
		printSeqc(leftSide, rightSide, diff);
	}
}
