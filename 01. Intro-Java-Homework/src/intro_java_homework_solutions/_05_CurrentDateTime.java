package intro_java_homework_solutions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _05_CurrentDateTime {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E dd-MM-yyyy, H:m a");
		LocalDateTime today = LocalDateTime.now();
		System.out.println("Today is: " + today.format(formatter));
	}
}