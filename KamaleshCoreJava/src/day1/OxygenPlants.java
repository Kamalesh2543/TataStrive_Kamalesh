package day1;

import java.util.Scanner;

public class OxygenPlants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the room(in m): ");
		double length = sc.nextDouble();
		if (length <= 0) {
			System.out.println("Invalid length");
		}
		System.out.println("Enter the breadth of the room(in m): ");
		double breadth = sc.nextDouble();

		if (breadth <= 0) {
			System.out.println("Invalid breadth");
		}
		System.out.println("Enter the plant area of single plant(in cm2):");
		double area = sc.nextDouble();
	    if (area <= 0) {
			System.out.println("Invalid area");
		}
		double Totalplants = length * breadth / area * 100 * 100;
		Totalplants -= Totalplants % 10;
		System.out.printf("Total number of plants:" + "%.0f", Totalplants);
		double Oxygen = Totalplants * 0.9;
		System.out.printf("\nTotal Oxygen production:" + "%.2f", Oxygen);
		

	}
}
