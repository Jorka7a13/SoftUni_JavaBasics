package java_loops_methods_classes_homework_solutions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class _10_OrderOfProducts {
	
	static List<Product> products = new ArrayList<Product>();
	
	private static class Product {
		private String name;
		private double price;
		
		public Product(String name, double price) {
			this.name = name;
			this.price = price;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
	}
	
	private static Product getProductByName(String name) {
		for (Product product : products) {
			if (product.getName().equals(name)) {
				return product;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		String line = null;
		double totalPrice = 0;
		
		try(BufferedReader reader = new BufferedReader(new FileReader("problem_10_products.txt"))) {
			while ((line = reader.readLine()) != null) {
				String[] input = line.split(" ");
				products.add(new Product(input[0], Double.parseDouble(input[1])));
			}
		} catch (IOException e) {
			System.err.println("Error in opening products file!");
			return;
		}
		
		try(BufferedReader reader = new BufferedReader(new FileReader("problem_10_order.txt"))) {
			while ((line = reader.readLine()) != null) {
				String[] currOrder = line.split(" ");
				totalPrice += Double.parseDouble(currOrder[0]) * getProductByName(currOrder[1]).getPrice();
			}
		} catch (IOException e) {
			System.err.println("Error in opening order file!");
			return;
		}
		
		try(PrintWriter writer = new PrintWriter("problem_10_output.txt", "UTF-8")) {
			writer.printf("%.1f", totalPrice);
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			System.err.println("Error in opening output file!");
			return;
		}
	}
}