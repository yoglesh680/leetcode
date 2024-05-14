package leetCodeMedium;

public class Problem172 {
	public static int trailingZeroes(int n) {
		int count=0;
	       while(n>0){
	        n/=5;
	        count+=n;
	       }
	       return count;
	}

	public static void main(String[] args) {
		int num = 5;
		int value = trailingZeroes(num);
		System.out.println(value);
	}

}
