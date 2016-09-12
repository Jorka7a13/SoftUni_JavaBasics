// Count the number of words in given sentence

package java_collections_basics_homework_solutions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _05_CountAllWords {
	public static void main(String[] args) {
		
		Pattern wordPattern = Pattern.compile("[a-zA-Z]+");
		Matcher matcher = wordPattern.matcher(new Scanner(System.in).nextLine());

		int count = 0;
		while(matcher.find()) {
		    count++;
		}
		System.out.println(count);
	}
}