package leetCodeMedium;

import java.util.ArrayList;
import java.util.List;

public class Problem204 {
	public static int countPrimes(int n) {
		List<Integer> list = new ArrayList<Integer>();
		int count = 0;
		for (int i = 2; i <= n; i++) {
			for (int j = 2; j < i - 1; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				list.add(i);
			} else {
				count = 0;
			}
		}
		return list.size();

	}

	public static void main(String[] args) {
		int n = 1;
		int num = countPrimes(n);
		System.out.println(num);
	}

}
