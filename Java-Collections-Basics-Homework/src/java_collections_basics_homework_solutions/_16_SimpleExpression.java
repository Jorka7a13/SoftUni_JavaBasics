package java_collections_basics_homework_solutions;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _16_SimpleExpression {
	public static void main(String[] args) {
		
		ArrayList<BigDecimal> numbers = new ArrayList(); 
		ArrayList<String> operations = new ArrayList(); 
		
		String input = new Scanner(System.in).nextLine();

		Pattern numberPattern = Pattern.compile("[\\d.]+");
		Matcher matcher = numberPattern.matcher(input);
		
		DecimalFormat decimalFormat = new DecimalFormat();
		decimalFormat.setParseBigDecimal(true);
		
		while (matcher.find()) {
			try {
				numbers.add((BigDecimal) decimalFormat.parse(matcher.group()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
		Pattern operationsPattern = Pattern.compile("[+-]");
		matcher = operationsPattern.matcher(input);
		while (matcher.find()) {
			operations.add(matcher.group());
		}
		
		BigDecimal result = numbers.get(0);
		for (int i = 1; i < numbers.size(); i++) {
			if (operations.get(i - 1).equals("+")) {
				result = result.add(numbers.get(i));
			} else if (operations.get(i - 1).equals("-")){
				result = result.subtract(numbers.get(i)); 
			}
		}
		System.out.println(result);
	}
}