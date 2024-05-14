package practice;

import java.util.HashSet;
import java.util.Set;

public class Problem202 {
	public static boolean isHappy(int n) {
		Set<Integer> set = new HashSet<Integer>();
		while (n != 1) {
			int sum = 0;
			while (n != 0) {
				int t = n % 10;
				sum = sum + t * t;
				n = n / 10;
			}
			if (set.contains(sum)) {
				return false;
			}
			set.add(sum);
			n = sum;
		}
		return true;

	}
//	Input: n = 19
//			Output: true
//			Explanation:
//			12 + 92 = 82
//			82 + 22 = 68
//			62 + 82 = 100
//			12 + 02 + 02 = 1

	public static void main(String[] args) {
		int num = 7;
		boolean data = isHappy(num);
		System.out.println(data);
	}

}
