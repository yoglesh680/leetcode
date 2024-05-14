package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LembdaPrac {
	public static void main(String args[]) {

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(1);
		list.add(3);

		list.stream().filter(e -> (e >= 3)).forEach(e -> System.out.println(e));
		// print odd and even number
		System.out.println("hello world");
		list.stream().filter(e -> (e % 2 == 0)).forEach(e -> System.out.println(e));

		// starting with 1
		System.out.println("Staring with 1");
		list.stream().map(e -> e + "").filter(s -> s.startsWith("1")).forEach(e -> System.out.println(e));

		List<String> listString = new ArrayList<>();
		String str = "roshni";
		Map<String, Long> map = Arrays.stream(str.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));

		System.out.println("---------------------------------------------------------");
		System.out.println(map);

		long st = str.chars().mapToObj(c -> (char) c).map(c -> c.toUpperCase(c)).count();

		System.out.println("---------------------------------------------------------");
		System.out.println(st);

		Employee emp = new Employee("roshni", 766887);
		Employee emp1 = new Employee("roshni1", 7687);
		Employee emp2 = new Employee("roshni2", 20000);
		Employee emp3 = new Employee("roshni3", 15000);
		Employee emp4 = new Employee("roshni4", 4000);
		Employee emp5 = new Employee("roshni5", 5000);
		Employee emp6 = new Employee("roshni6", 60000);
		Employee emp7 = new Employee("roshni7", 766887);
		Employee emp8 = new Employee("roshni8", 10000);
		Employee emp9 = new Employee("roshni9", 100000);
		List<Employee> listEmployees = new ArrayList<Employee>();
		listEmployees.add(emp);
		listEmployees.add(emp1);
		listEmployees.add(emp2);
		listEmployees.add(emp3);
		listEmployees.add(emp4);
		listEmployees.add(emp5);
		listEmployees.add(emp6);
		listEmployees.add(emp7);
		listEmployees.add(emp8);
		listEmployees.add(emp9);
		listEmployees.stream().filter(e -> (e.getSalary() >= 10000)).forEach(e -> System.out.println(e));

		Stream<Employee> userStream = Stream.of(new Employee("Alice"), new Employee("Bob"), new Employee("Chuck"));
		userStream.peek(u -> u.setName(u.getName().toLowerCase())).forEach(e -> System.out.println(e));
	}
}
