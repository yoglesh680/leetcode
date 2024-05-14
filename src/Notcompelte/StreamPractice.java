package Notcompelte;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 5, 6, 7, 1, 2, 3);
		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		System.out.println("Print all the number which start with 1");

		list.stream().map(s -> s + "").filter(e -> e.startsWith("1")).forEach(System.out::println);

		System.out.println("Print ALL distnict number given the list");
		list.stream().distinct().forEach(System.out::println);

		System.out.println("Print ALL Dublicate value number given the list");
		Set<Integer> set = new HashSet<Integer>();
		list.stream().filter(n -> !set.add(n)).forEach(System.out::println);

		System.out.println("Print First Element in the List");
		list.stream().findFirst().ifPresent(System.out::println);

		System.out.println("sum of the given list");
		long num = list.stream().count();
		System.out.println(num);

		System.out.println("Maximum value in the given list");
		long maxNum = list.stream().max(Integer::compare).get();
		System.out.println(maxNum);
		System.out.println("Minimum value in the given list");
		long minNum = list.stream().min(Integer::compare).get();
		System.out.println(minNum);

		System.out.println("print non repeated charcter in the given string");
		String input = "Java articles are Awesome";

		Character resCharacter = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst()
				.get();
		System.out.println(resCharacter);

		System.out.println("print  repeated charcter in the given string");
		Character result = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() > 1L).map(entry -> entry.getKey()).findFirst()
				.get();
		System.out.println(result);

		System.out.println("print all the number in sort");
		list.stream().sorted().forEach(System.out::println);

		System.out.println("print all the number in Diasanding order");
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

		System.out.println("print cube for those value which cube are greater than 50");
		list.stream().map(i -> i * i * i).filter(i -> i > 50).forEach(System.out::println);

		List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		Map<String, Long> map = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);

		Map<String, Long> mapFrequency = names.stream().filter(i -> Collections.frequency(names, i) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(mapFrequency);
		
		
	}
}
