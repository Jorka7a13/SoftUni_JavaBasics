package java_loops_methods_classes_homework_solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _08_SumNumbersFromTextFile {
	public static void main(String[] args) {
		
		String line = null;
		int sum = 0;
		
		try(BufferedReader reader = new BufferedReader(new FileReader("problem_8_input.txt"))) {
			while ((line = reader.readLine()) != null) {
			    sum += Integer.parseInt(line);
			}
		} catch (IOException e) {
			System.err.println("Error");
			return;
		}
		
		System.out.println(sum);
	}
}