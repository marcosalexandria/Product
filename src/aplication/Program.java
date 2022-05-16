package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		Integer numberProducts = sc.nextInt();
		
		List<Product> products = new ArrayList<>();
		for (int i = 1; i<=numberProducts; i++) {
			System.out.println("Product #" + i + "_data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char optionProduct = sc.next().charAt(0);
			
			if (optionProduct == 'i') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				System.out.print("Customs Fee: " );
				Double customsFee = sc.nextDouble();
				
				Product product = new ImportedProduct(name, price, customsFee);
				products.add(product);
			}else if(optionProduct == 'c') {
				System.out.print("Name: ");
				String nameCommon = sc.next();
				System.out.print("Price: ");
				Double priceCommon = sc.nextDouble();
				
				Product productCommon = new Product(nameCommon, priceCommon);
				products.add(productCommon);
			}else if(optionProduct == 'u') {
				System.out.print("Name: ");
				String nameUsed = sc.next();
				System.out.print("Price: ");
				Double priceUsed = sc.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String dateString = sc.next();
				
				SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
				Date date = sdf2.parse(dateString);
				
				Product UsedProduct = new UsedProduct(nameUsed, priceUsed, date);
				products.add(UsedProduct);
			}
			
			
		}
		
		System.out.println();
		for (Product product: products) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}

}
