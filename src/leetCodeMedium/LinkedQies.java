package leetCodeMedium;

import java.util.Arrays;
import java.util.List;

public class LinkedQies {
	public static int getValue(List<Integer> list, int num) {
		int result1 = Math.max(list.get(0), list.get(1) + list.get(2)); // max(10, 20+30)
		int result2 = Math.max(list.get(0) + list.get(1), list.get(2)); // max(10+20, 30)
		int finalOutput = Math.min(result1, result2); // min(30, 50)
		return finalOutput;

	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30);
		int num = 2;
		int output = getValue(list, num);
		System.out.println(output);

	}

}
