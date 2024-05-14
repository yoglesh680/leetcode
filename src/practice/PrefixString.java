package practice;

import java.util.Arrays;

public class PrefixString {

	public static String longestCommonPrefix(String[] strs) {
		Arrays.sort(strs);
		String str = strs[0];
		String str2 = strs[strs.length - 1];
		int index = 0;
		System.out.println(index);
		
		System.out.println(str);
		System.out.println(str2);
		while (index < str.length()) {
			if (str.charAt(index) == str2.charAt(index)) {
				index++;
			} else {
				break;
			}
		}
		return index == 0 ? "" : str.substring(0, index);
	}

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
		System.out.println(strs.toString());
		String value=longestCommonPrefix(strs);
		System.out.println(value);
		String val="roshni";
		String val2="yoglesh";
//		int result=val.indexOf(val2);
		//int result=lastIndexOf(val, length());
	//	System.out.println(result);
	}
}
