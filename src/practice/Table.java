package practice;

import java.util.Arrays;
import java.util.List;

public class Table {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		list.stream().map(i -> i * 11).forEach(e -> System.out.println(e));
	}
}
