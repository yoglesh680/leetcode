package practice;

import java.util.ArrayList;
import java.util.List;

public class DoubleBraces {
	public static void main(String[] args) {
		List<String> stringSets = new ArrayList() {
			{
				add("set4");
				add("set2");
				add("set3");
			}
		};

		doSomething(stringSets);
	}

	private static void doSomething(List<String> stringSets) {
		System.out.println(stringSets);
	}
}
