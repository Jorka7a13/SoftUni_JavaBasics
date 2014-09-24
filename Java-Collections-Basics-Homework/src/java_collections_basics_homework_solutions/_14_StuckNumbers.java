package java_collections_basics_homework_solutions;

import java.util.Scanner;

public class _14_StuckNumbers {
	
	private static boolean isStuckNumber(int num1, int num2, int num3, int num4) {
		if (("" + num1 + num2).equals("" + num3 + num4)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] inputStrings = scanner.nextLine().split(" ");
		
		boolean isFound = false;
		
		if (n < 4) {
			System.out.println("No");
			return;
		}
		
		int[] input = new int[n];
		for (int i = 0; i < inputStrings.length; i++) {
			input[i] = Integer.parseInt(inputStrings[i]);
		}
		
		for (int j = 0; j < n; j++) {
			for (int j1 = 0; j1 < n; j1++) {
				for (int j2 = 0; j2 < n; j2++) {
					for (int j3 = 0; j3 < n; j3++) {
						if (j != j1 && j != j2 && j != j3 && j1 != j2 && j1 != j3 && j2 != j3) {
							if (isStuckNumber(input[j], input[j1], input[j2], input[j3])) {
								isFound = true;
								System.out.println(input[j] + "|" + input[j1]+ "==" + input[j2] + "|" + input[j3]);
							}
						}
					}
				}
			}
		}
		if (!isFound) {
			System.out.println("No");
		}
	}
}