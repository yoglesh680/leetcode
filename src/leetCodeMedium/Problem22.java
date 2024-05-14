package leetCodeMedium;

import java.util.ArrayList;
import java.util.List;

public class Problem22 {
	public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<String>();
		int start=0;
		int end=0;
		
		if(start<n) {
			list.add("(");
			start++;
		}
		else if(end<n) {
			list.add(")");
			end++;
		}
		return list;

	}

	public static void main(String[] args) {
		int num = 3;
		List<String> list = generateParenthesis(num);
		System.out.println(list);
	}

}
