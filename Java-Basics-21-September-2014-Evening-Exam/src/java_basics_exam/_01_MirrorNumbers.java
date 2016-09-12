package java_basics_exam;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_MirrorNumbers {
	
	private static boolean isMirrorNumber(String num1, String num2) {
		String reversed = new StringBuilder(num1).reverse().toString();
		
		if (reversed.equals(num2)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] input = scanner.nextLine().split(" ");

		ArrayList<String> foundMirrorNumbers = new ArrayList();
		
		boolean foundResult = false;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j && isMirrorNumber(input[i], input[j])) {
					if (!foundMirrorNumbers.contains(input[i])) {
						foundResult = true;
						foundMirrorNumbers.add(input[j]);
						System.out.println(input[i] + "<!>" + input[j]);
					}
				}
				
			}
		}
		
		if (!foundResult) {
			System.out.println("No");
		}
	}
}