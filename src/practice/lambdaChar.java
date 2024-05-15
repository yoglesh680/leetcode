package practice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lambdaChar {
	@SuppressWarnings("static-access")
	public static void main(String args[]) {
		String str = "This is a what We WANTED to hava gUN with bullETS";
		str.chars().mapToObj(c -> (char) c).filter(e -> e.isLowerCase(e)).forEach(e -> System.out.print(" " + e));
		str.chars().mapToObj(c -> (char) c).filter(e -> e.isUpperCase(e)).forEach(e -> System.out.print(" " + e));
		long s1 = str.chars().mapToObj(c -> (char) c).filter(e -> e.isLowerCase(e)).count();
		System.out.println("\n" + s1);

		long s2 = str.chars().mapToObj(c -> (char) c).filter(e -> e.isUpperCase(e)).count();
		System.out.println(s2);

		
		String reverseStr = Stream.of(str)
				.map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining());
		System.out.println(reverseStr);
		
		
		
	}
}
