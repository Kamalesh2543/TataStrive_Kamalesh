package day6;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student ID:");
		int studentId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name:");
		String studentName=sc.nextLine();
		System.out.println("Enter the Department:");
		String department=sc.nextLine();
		System.out.println("Enter Gender:");
		String gender=sc.nextLine();
		System.out.println("Enter category(Hosteller or DayScholar)");
		String category=sc.nextLine();
		System.out.println(("Enter College Fee:"));
		double collegeFee=sc.nextDouble();
		if(category.equals("Hosteller")) {
			System.out.println("Enter the Room Number:");
			int roomNumber=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Block Name:");
			char blockName=sc.next().charAt(0); 
			sc.nextLine();
			System.out.println("Enter Room type:");
			String roomType=sc.nextLine();
			Hosteller hosteller=new Hosteller(studentId,studentName,department,gender,category,
					collegeFee, roomNumber,blockName, roomType);
			System.out.println("Total College Fee is "+hosteller.calculateTotelFee());
		}
		else if(category.equals("DayScholar")){
			System.out.println("Enter bus Number:");
			int busNumber=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Distrance:");
			float distrance=sc.nextFloat();
			sc.nextLine();
			
			DayScholar dayScholar=new DayScholar(studentId, studentName, department, gender, category, collegeFee, busNumber, distrance);
			System.out.println("Total College Fee is "+dayScholar.calculateTotelFee());
			
		}
		else {
			System.out.println("Invalid category.");
		}
		sc.close();
	}

}
