package leetCodeMedium;

public class Problem1227 {
	public static int findSpecialInteger(int[] arr) {

		int count = 0;
		int len = arr.length;
		int value = len / 4;
		
		int prev=arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >prev) {
				count++;
				if(count>value) {
					return count;
				}
			}

		}

		return count;

	}

	public static void main(String[] args) {
		int[] nums = { 1,2,2,6,6,6,6,7,10 };
		int value = findSpecialInteger(nums);
		System.out.println(value);
	}

}
