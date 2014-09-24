package java_basics_exam;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03_ValidUsernames {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] userNames = scanner.nextLine().split("[ /\\\\(\\)]+");
		
		Pattern userNamePattern = Pattern.compile("^[a-zA-Z][\\w\\d]+");
		Matcher matcher;
		
		ArrayList<String> validUserNames = new ArrayList();
		
		for (int i = 0; i < userNames.length; i++) {
			matcher = userNamePattern.matcher(userNames[i]);
			
			if (matcher.find()) {
				if (userNames[i].length() > 2 && userNames[i].length() < 26) {
					validUserNames.add(userNames[i]);
				}
			}
		}
		
		int biggestSumLenght = 0, currSumLenght = 0;
		int biggestSumIndex = 0;
		
		for (int i = 0; i < validUserNames.size(); i++) {
			if (i < validUserNames.size() - 1) {
				currSumLenght += validUserNames.get(i).length() + validUserNames.get(i + 1).length();
			}
			
			if (currSumLenght > biggestSumLenght) {
				biggestSumLenght = currSumLenght;
				biggestSumIndex = i;
			}
			currSumLenght = 0;
		}
		
		System.out.println(validUserNames.get(biggestSumIndex));
		System.out.println(validUserNames.get(biggestSumIndex + 1));
	}
}