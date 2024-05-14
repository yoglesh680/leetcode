package leetCodeMedium;

import java.util.ArrayList;
import java.util.List;

public class Problem722 {
	public static List<String> removeComments(String[] source) {
		List<String> list = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		for (String s : source) {
			sb.append(s);
		}
		for (int i = 0; i < sb.length(); i++) {
			char str = sb.charAt(i);

		}
		return list;

	}

	public static void main(String[] args) {
		String[] source = { "/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;",
				"/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}" };
//	output	 ["int main()","{ ","  ","int a, b, c;","a = b + c;","}"]
		List<String> list = removeComments(source);
		System.out.println(list);
	}

}
