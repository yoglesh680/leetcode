package practice;

class Calu {
	public static void subarraySum(int[] arr, int n, int s) {
		for (int i = 0; i <= 5; i++) {
			int sum = arr[i];
			if (sum == s) {
				System.out.println("not found");
			} else
				for (int j = i + 1; j <= n; j++) {
					sum += arr[j];
					if (sum == s) {
						System.out.println("sum found between : " + sum);
					}
				}
		} // Your code here

	}
}

public class Solution {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		Calu.subarraySum(arr, 4, 12);
	}

}
