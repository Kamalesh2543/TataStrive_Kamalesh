package day6;

import java.util.Scanner;

public class UserInterfaceDelivery {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Customer Name");
		String customerName=sc.nextLine();
		System.out.println("Enter the phone number");
		String phoneNumber=sc.nextLine();
		System.out.println("Enter the street Name");
		String streetName=sc.nextLine();
		System.out.println("Enter your bill amount");
		int amount=sc.nextInt();
		System.out.println("Enter your distance");
		int distance=sc.nextInt();
		
		CustomerDetails c=new CustomerDetails(customerName, phoneNumber, streetName, amount, distance);
		System.out.println(c);
	}
}
