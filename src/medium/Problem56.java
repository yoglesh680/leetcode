package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem56 {
	public static int[][] merge(int[][] intervals) {
		if (intervals.length <= 1) {
			return intervals;
		}
		List<int[]> list = new ArrayList<int[]>();
		int[] current = intervals[0];
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		for (int i = 0; i < intervals.length; i++) {
			if (intervals[i][0] <= current[1]) {
				current[1] = Math.max(current[1], intervals[i][1]);
			} else {
				list.add(current);
				current = intervals[i];
			}

		}
		list.add(current);
		return list.toArray(new int[list.size()][]);

	}

	public static void main(String[] args) {
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		int[][] result = merge(intervals);
		System.out.println(Arrays.toString(result));
	}

}
