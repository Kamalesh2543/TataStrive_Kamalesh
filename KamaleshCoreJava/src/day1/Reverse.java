package day1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if(num<1000 || num>10000){
			System.out.println("Invalid number");
			return;}
		int result=0;
		String expand="";
		int count=4;
		while(num!=0) {
			int rem=num%10;
			expand+=rem;
			for(int i=1;i<count;i++) {
				expand+="0";
			}if(count!=1) 
				expand+="+";
				count--;
			
			result=result*10+rem;
			num=num/10;
		}
		System.out.println(result);
		System.out.println(expand);
	}

}
