package leetCode;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewProblem {
	public static String prrintChar(String data) {
		 Character result =  data.chars()           // IntStream
	             .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))  // convert to lowercase & then to Character object Stream
	             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // store in a LinkedHashMap with the count
	             .entrySet().stream()                       // EntrySet stream
	             .filter(entry -> entry.getValue() >= 1L)   // extracts characters with a count of 1
	             .map(entry -> entry.getKey())              // get the keys of EntrySet
	             .findFirst().get();                        // get the first entry from the keys
		return result.toString();
	        
		
	}

	public static void main(String[] args) {
		String data = "roshnhi";

		String d=prrintChar(data);
		System.out.println(d);
	}
}

//	private static void prrintChar(String input) {
//		Map<String, Long> map1 = Arrays.stream(input.split("")).map(String::toLowerCase)
//				.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));
//
//		System.out.println(map1);
//
//		Map<String, Long> map = Arrays.stream(input.split("")).map(String::toLowerCase)
//				.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));
//		for (Entry<String, Long> entry : map.entrySet()) {
//			if (entry.getValue() ==1) {
//				System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
//			}
//		}
// System.out.println(map);

//		Map<Character, Integer> charCountMap = new HashMap<>();
//
//		for (char c : input.toCharArray()) {
//			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
//		}
//		System.out.println("Repeated characters in the string:");
//		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
//			if (entry.getValue() > 1) {
//				System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
//			}
//		}

//Map<String, Long> map = Arrays.stream(str.split("")).map(String::toLowerCase)
//.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));
