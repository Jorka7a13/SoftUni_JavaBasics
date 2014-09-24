// Find how many times a word appears in given text

package java_collections_basics_homework_solutions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _06_CountSpecifiedWord {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String targetWord = scanner.nextLine();
		
		Pattern wordPattern = Pattern.compile("(?i)" + targetWord + "\\b"); // "(?i)" makes it case insensitive
		Matcher matcher = wordPattern.matcher(input);
		
		int count = 0;
		while(matcher.find()) {
		    count++;
		}
		System.out.println(count);
	}
}