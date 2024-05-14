package starPattern;

public class Pattern4 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {

			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int i = n; i >= 0; i--) {

			for (int k = i; k > 0; k--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}

//*
//**
//***
//****
//*****
//*****
//****
//***
//**
//*
