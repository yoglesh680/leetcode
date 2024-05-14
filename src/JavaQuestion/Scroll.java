package JavaQuestion;

import java.util.Scanner;

public class Scroll {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int position = 0; // Initial position

		while (true) {
			System.out.println("Position: " + position);
			System.out.println("1. Scroll up");
			System.out.println("2. Scroll down");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				position++; // Scroll up
				break;
			case 2:
				position--; // Scroll down
				break;
			case 3:
				System.out.println("Exiting...");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice! Please enter 1, 2, or 3.");
			}
		}
	}

}
