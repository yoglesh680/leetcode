package starPattern;

public class Pattern6 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = n; i >= 0; i--) {

			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//******
//*****
//****
//***
//**
//*