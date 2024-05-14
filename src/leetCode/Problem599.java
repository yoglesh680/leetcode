package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem599 {
	public static String[] findRestaurant(String[] list1, String[] list2) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		List<String> list = new ArrayList<String>();
		int maxValue = Integer.MAX_VALUE;
		for (int i = 0; i < list1.length; i++) {
			map.put(list1[i], i);
		}
		for (int j = 0; j < list2.length; j++) {
			if (map.containsKey(list2[j])) {
				int index = j + map.get(list2[j]);
				if (index < maxValue) {
					maxValue = index;
					list.clear();
					list.add(list2[j]);
				}

				else if (index == maxValue) {
					list.add(list2[j]);
				}
			}
		}
		return list.toArray(new String[0]);

	}

	public static void main(String[] args) {
		String[] list1 = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		String[] list2 = { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" };
		String[] result = findRestaurant(list1, list2);
		for (String string : result) {
			System.out.print(string + " ");
		}

	}
}
