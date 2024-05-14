package practice;

public class ArrayPractice {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		for (i = 1; i <= 10; i++) {

			sum = sum + i;
			System.out.print(i +" ");
			if(i!=0) {
				System.out.print("+");

			}
			System.out.println(" = "+sum);

		}

	}

}
