package leetCode;

import java.time.LocalDate;
import java.util.Locale;

public class Problem1185 {
	public static String dayOfTheWeek(int day, int month, int year) {
		LocalDate date = LocalDate.of(year, month, month);
		return date.getDayOfWeek().getDisplayName(java.time.format.TextStyle.FULL, Locale.ENGLISH);

	}

	public static void main(String[] args) {
		int day = 31;
		int month = 8;
		int year = 2019;
		String result = dayOfTheWeek(day, month, year);
		System.out.println(result);

	}

}
