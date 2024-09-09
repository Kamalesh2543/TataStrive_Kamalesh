 package day9;

import java.util.Arrays;

public class HappyMart {
	public static void main(String[] args) {
		Product[] products= {
				new Product(2002,"Adapter",400),
				new Product(2034,"Keyboard",1000),
				new Product(2067,"Mouse",800),
				new Product(2052,"Laptop",30000),
				new Product(2003,"Mobile",15000),
				
		};
		System.out.println("--------------");
		for( Product i:products) {
	System.out.println(i);}
		
		Arrays.sort(products,new SortById());
		System.out.println("--------------");
		for(int i=0;i<products.length;i++) {
			System.out.println(products[i]);
			}
		Arrays.sort(products,new SortByName());
		System.out.println("--------------");
		for(int i=0;i<products.length;i++) {
			System.out.println(products[i]);
			}
		Arrays.sort(products,new SortByPrice());
		System.out.println("--------------");
		for(int i=0;i<products.length;i++) {
			System.out.println(products[i]);
			}
		
	}
	
}

