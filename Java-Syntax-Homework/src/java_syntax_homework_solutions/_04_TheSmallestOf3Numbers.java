package java_syntax_homework_solutions;

import java.util.Scanner;

public class _04_TheSmallestOf3Numbers {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter three numbers: ");
		double a = Double.parseDouble(scanner.next());
		double b = Double.parseDouble(scanner.next());
		double c = Double.parseDouble(scanner.next());
		
		System.out.println(Math.min(Math.min(a, b), c));
	}
}