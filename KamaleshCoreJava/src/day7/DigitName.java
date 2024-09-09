package day7;

import java.util.Scanner;

public class DigitName {
	private static final String[] DigitWord= {
			"zero", "one", "two", "three", "four",
	        "five", "six", "seven", "eight", "nine"	
	};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers:");
		String input=sc.nextLine();
		
		if(input.charAt(0)=='0') {
			System.out.println("Invalid Digit.Number should not starts with Zero.");
		}
		else {
			StringBuilder output=new StringBuilder();
			for(int i=0;i<input.length();i++) {
				char digit=input.charAt(i);
				if(Character.isDigit(digit)) {					
					output.append(DigitWord[digit - '0']).append(" ");
				}
			}
			System.out.println(output.toString().trim());
		} 
		
	}

}
