// Find how many times given string appears in given text as substring

package java_collections_basics_homework_solutions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _07_CountSubstringOccurrences {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String targetSubstr = scanner.nextLine();
		
		Pattern substrPattern = Pattern.compile("(?i)" + targetSubstr); // "(?i)" makes it case insensitive
		Matcher matcher = substrPattern.matcher(input);
		
		int count = 0;
		while(matcher.find()) {
		    count++;
		    matcher.region(matcher.start() + 1, input.length()); // In case we have overlapping substrings
		}
		System.out.println(count);
	}
}