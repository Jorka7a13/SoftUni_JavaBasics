package java_syntax_homework_solutions;

import java.util.Scanner;

public class _01_RectangleArea {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a: ");
		int a = Integer.parseInt(scanner.next());
		System.out.print("Please enter b: ");
		int b = Integer.parseInt(scanner.next());
		
		System.out.println("The area is: " + a * b);
	}
}