package day8;

import java.util.Scanner;

public class NumberPlay {
	public static void main(String[] args) {
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>=10 && num<=50&&num<100) {
			int i=num/10;
			int j=num%10;
			num=j-i;
			System.out.println(num);
		}else if(num>50 && num<100) {
			int i=num/10;
			int j=num%10;
			num=i-j;
			System.out.println(num);
		}
		else if(num<10 || num>=100) {
			System.out.println("Invalid Number.");
			
		}
		
	}

}
