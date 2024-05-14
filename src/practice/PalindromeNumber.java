package practice;

public class PalindromeNumber {
	public static void main(String[] args) {
		int n=100,i,j;
		int count=0;
		for(i=1;i<n;i++) {
			for(j=2;j<i-1;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
			else {
				count=0;
			}
		}
//		int n, r, sum = 0, temp;
//		n = 454;
//		temp = n;
//		while (n > 0) {
//			r = n % 10;
//			sum = (sum * 10) + r;
//			n = n / 10;
//
//		}
//		if (sum == temp) {
//			System.out.println("PalinDrome Number");
//		} else {
//			System.out.println("Not PalinDrome Number");
//		}
	}

}
