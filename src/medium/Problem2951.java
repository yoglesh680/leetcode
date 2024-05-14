package medium;

import java.util.ArrayList;
import java.util.List;

public class Problem2951 {
	public static List<Integer> findPeaks(int[] mountain) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < mountain.length - 1; i++) {
			int prev = mountain[i - 1];
			int current = mountain[i];
			int next = mountain[i + 1];
			if (prev < current && current > next) {
				list.add(i);
			}
		}
		return list;

	}

	public static void main(String[] args) {
		int[] peaks = {1,4,3,8,5};
		List<Integer> list = new ArrayList<Integer>();
		list = findPeaks(peaks);
		System.out.println(list);
	}

}
