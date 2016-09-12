package java_syntax_homework_solutions;

import java.util.Scanner;

public class _07_CountOfBitsOne {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		System.out.println(Integer.bitCount(Integer.parseInt(scanner.next())));
	}
}