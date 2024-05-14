package leetCodeMedium;

import java.util.ArrayList;
import java.util.List;

public class Problem412 {
	public static List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				list.add("FizzBuzz");

			} else if (i % 3 == 0) {
				list.add("Fizz");

			} else if (i % 5 == 0) {
				list.add("Buzz");

			} else {
				list.add(Integer.toString(i));
			}
		}

		return list;

	}

	public static void main(String[] args) {
		int n = 3;
		List<String> result = new ArrayList<String>();
		result = fizzBuzz(n);
		System.out.println(result);
	}

}
