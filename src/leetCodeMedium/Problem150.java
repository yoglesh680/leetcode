package leetCodeMedium;

public class Problem150 {
	public static int evalRPN(String[] tokens) {
		int n = 0;
		int sum = 0;
		for (String s : tokens) {
			if (s.equals("+")) {
			//	sum += num;
			} else if (s.equals("*")) {
				int num2 = Integer.valueOf(s);
				sum *= n;
			} else if (s.equals("/")) {
				int num3 = Integer.valueOf(s);
				sum /= n;
			} else {
				n = Integer.valueOf(s);
				sum += n;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String[] tokesn = { "2", "1", "+", "3", "*" };
		int num = evalRPN(tokesn);
		System.out.println(num);
	}
}
