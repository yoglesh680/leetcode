package practice;

import java.util.Arrays;

public class RelativeRanks {
	public static String[] findRelativeRanks(int[] score) {
		Arrays.sort(score);
		String[] result = new String[score.length];
		for (int i = 0; i < score.length; i++) {
			if (score[i] == 1) {
				result[i] = "Gold Medal";
			} else if (score[i] == 2) {
				result[i] = "Silver Medal";
			} else if (score[i] == 3) {
				result[i] = "Bronze Medal";
			} else {
				result[i] = "4";
				result[i + 1] = "5";
				return result;
			}

		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 10, 3, 8, 9, 4 };
		String[] data = findRelativeRanks(nums);
		for (String string : data) {
			System.out.print(string + " ");
		}
		String s = "hello";

		 String[] str=s.split("\\s+");
	        int len=0;
	        for(String value: str){
	            if(!value.isEmpty()){
	                len++;
	            }
	        }
		System.out.println("++++++++++++++++++++++++ " +len);

		// ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
	}
}
