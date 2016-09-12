package java_syntax_homework_solutions;

import java.util.Scanner;

public class _06_FormattingNumbers {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter an int, a float and another float: ");
		int a = Integer.parseInt(scanner.next());
		float b = Float.parseFloat(scanner.next());
		float c = Float.parseFloat(scanner.next());
		
		String hex = Integer.toHexString(a).toUpperCase();
		String bin = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
		
		System.out.printf("|%-10s|%10s|%10.2f|%-10.3f|", hex, bin, b, c);
	}
}