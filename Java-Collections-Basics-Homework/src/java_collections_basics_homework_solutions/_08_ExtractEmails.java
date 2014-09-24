// Extract all email addresses from given text

package java_collections_basics_homework_solutions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _08_ExtractEmails {
	public static void main(String[] args) {
		
		Pattern emailPattern = Pattern.compile("[a-zA-Z0-9][\\w\\d.-]+[a-zA-Z0-9](?!.|-|_)*@(([a-zA-Z-]*)\\.([a-zA-Z-]+))+[a-zA-Z]");
		Matcher matcher = emailPattern.matcher(new Scanner(System.in).nextLine());
		
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}