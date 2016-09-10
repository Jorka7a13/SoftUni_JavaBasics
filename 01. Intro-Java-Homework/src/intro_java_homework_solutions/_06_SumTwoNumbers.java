package intro_java_homework_solutions;

import java.util.Scanner;

public class _06_SumTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;

		System.out.print("Please enter the first number: ");
		String input = sc.nextLine();
		try {
			a = Integer.parseInt(input);
		} catch (NumberFormatException ex) {
			System.out.println("That's not a valid integer!");
			sc.close();
			return;
		}

		System.out.print("Please enter the second number: ");
		input = sc.nextLine();
		try {
			b = Integer.parseInt(input);
		} catch (NumberFormatException ex) {
			System.out.println("That's not a valid integer!");
			sc.close();
			return;
		}

		System.out.println("The sum is: " + (a + b));
		sc.close();
	}
}