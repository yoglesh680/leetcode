package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Problem387 {
	public static int firstUniqChar(String s) {
		 Map<Character, Integer> count = new HashMap<>();
	        
	        for (char c : s.toCharArray()) {
	            count.put(c, count.getOrDefault(c, 0) + 1);
	        }

	        for (int i = 0; i < s.length(); i++) {
	            if (count.get(s.charAt(i)) == 1) {
	                return i;
	            }
	        }

	        return -1;

	}

	public static void main(String[] args) {
		String s = "loveleetcode";
		int data = firstUniqChar(s);
		System.out.println(data);
	}

}
