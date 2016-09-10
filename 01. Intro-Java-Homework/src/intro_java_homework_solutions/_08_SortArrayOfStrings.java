package intro_java_homework_solutions;

import java.util.Arrays;
import java.util.Scanner;

public class _08_SortArrayOfStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;

		System.out.print("Please enter n: ");
		String input = sc.nextLine();
		try {
			n = Integer.parseInt(input);
		} catch (NumberFormatException ex) {
			System.out.println("That's not a valid integer!");
			sc.close();
			return;
		}
		
		String array[] = new String[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextLine();
		}
		
		Arrays.sort(array);
		
		for (String string : array) {
			System.out.println(string);
		}
	}
}