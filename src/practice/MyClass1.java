package practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyClass1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("anil", "yoglesh", "deepak", "bala");

		List<String> classList = list.stream().filter(s -> s.charAt(0) <= 'd').toList();

		System.out.println(classList);
		String str = "yoglesh";

		Map<Character, Long> map = str.chars().mapToObj(s -> (char) s)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
       System.out.println(map);
//		int[] nums= {1,2,3,0,4,0,9,0};
//		int[] nums1=new int[nums.length];
//		int left=0;
//		int right=nums.length-1;
//		while(left<right) {
//			if(nums[left]<nums[right]) {
//				left++;
//			}
//			else {
//				right--;
//			}
//		}
//		System.out.println(Arrays.toString(nums));
	}

}
