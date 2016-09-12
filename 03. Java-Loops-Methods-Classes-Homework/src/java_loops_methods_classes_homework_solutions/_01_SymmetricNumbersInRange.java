package java_loops_methods_classes_homework_solutions;

import java.util.Scanner;

public class _01_SymmetricNumbersInRange {
	
	private static int getNumInReverse(int num) {
		int result = 0, digit, temp = num;
		
		int i = String.valueOf(num).length();
		for (; i > 0; i--) {
			result += (temp % 10) * Math.pow(10, i - 1);
			temp /= 10;
		}
		
		return result;
	}
	
	private static boolean isSymmetric(int num) {
		return num == getNumInReverse(num);
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a starting and ending number: ");
		int start = Integer.parseInt(scanner.next());
		int end = Integer.parseInt(scanner.next());
		
		for (int i = start; i <= end; i++) {
			if (isSymmetric(i)) {
				System.out.print(i + " ");
			}
		}
	}
}