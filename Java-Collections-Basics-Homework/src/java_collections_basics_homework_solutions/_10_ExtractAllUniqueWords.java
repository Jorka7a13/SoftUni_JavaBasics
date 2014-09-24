// Extract all words from the input and print them in alphabetical order

package java_collections_basics_homework_solutions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _10_ExtractAllUniqueWords {
	public static void main(String[] args) {
		
		HashSet<String> resultList = new HashSet();
		
		Pattern wordPattern = Pattern.compile("[a-zA-Z]+");
		Matcher matcher = wordPattern.matcher(new Scanner(System.in).nextLine());
		
		while (matcher.find()) {
			resultList.add(matcher.group().toLowerCase());
		}
		
		for (String string : resultList) {
			System.out.print(string + " ");
		}
	}
}