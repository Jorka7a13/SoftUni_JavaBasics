package java_syntax_homework_solutions;

import java.util.Scanner;

public class _05_DecimalToHexadecimal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter an number in decimal: ");
		String result = Integer.toHexString(Integer.parseInt(scanner.next())).toUpperCase();

		System.out.println(result);
	}
}