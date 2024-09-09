package day1;

import java.util.Scanner;

public class BMIcalc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weight in kg:");
		double weight=sc.nextDouble();
		System.out.println("Enter height in cm:");
		double height=sc.nextDouble();
		double Bmi=weight/((height/100)*(height/100));
		System.out.printf("Your BMI is "+"%.2f",Bmi);
		if(Bmi>=25) {
			System.out.printf("\nYou are overweight.Reduce %.2f kg to be fit",Bmi-25);
	}
		else if (Bmi<=25&&Bmi>=18.5) {
			System.out.println("\nYour are fit and health");}
				
		else if(Bmi<=25) {
				System.out.printf("\nYou are under weight.Gain %.2f kg to be fit",25-Bmi);
			
		}
	}

}
