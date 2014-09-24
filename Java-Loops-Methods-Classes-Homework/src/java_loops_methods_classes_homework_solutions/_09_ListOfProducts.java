package java_loops_methods_classes_homework_solutions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _09_ListOfProducts {
	
	private static class Product implements Comparable<Product> {
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


		public int compareTo(Product product) {
			if (this == product) return 0;
			
			if (this.price < product.price) return -1;
		    if (this.price > product.price) return 1;
		    return 0;
		}
		
		public static Comparator<Product> ProductPriceComparator = new Comparator<Product>() {
			public int compare(Product product1, Product product2) {
				return product1.compareTo(product2);
			}
		};
	}
	
	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		String line = null;
		
		try(BufferedReader reader = new BufferedReader(new FileReader("problem_9_input.txt"))) {
			while ((line = reader.readLine()) != null) {
				String[] input = line.split(" ");
				products.add(new Product(input[0], Double.parseDouble(input[1])));
			}
		} catch (IOException e) {
			System.err.println("Error in opening input file!");
			return;
		}
		
		products.sort(Product.ProductPriceComparator);
		
		try(PrintWriter writer = new PrintWriter("problem_9_output.txt", "UTF-8")) {
			for (Product product : products) {
				writer.write(product.getName() + " " + product.getPrice() + "\n");
			}
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			System.err.println("Error in opening output file!");
			return;
		}
	}
}