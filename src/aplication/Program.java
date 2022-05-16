package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		Integer numberProducts = sc.nextInt();
		
		List<Product> products = new ArrayList<>();
		for (int i = 1; i<=numberProducts; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char optionProduct = sc.next().charAt(0);
			
			switch (optionProduct) {
			case 'i': 
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				System.out.print("Customs Fee: " );
				Double customsFee = sc.nextDouble();
				
				Product product = new ImportedProduct(name, price, customsFee);
				products.add(product);
				break;
			case 'c':
				System.out.print("Name: ");
				String nameCommon = sc.next();
				System.out.print("Price: ");
				Double priceCommon = sc.nextDouble();
				
				Product productCommon = new Product(nameCommon, priceCommon);
				products.add(productCommon);
				break;
			default:
				System.out.println("ERRO");
			}
		}
		
		sc.close();
	}

}
