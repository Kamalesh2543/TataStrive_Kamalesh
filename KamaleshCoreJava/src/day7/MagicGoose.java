package day7;

import java.util.Scanner;

public class MagicGoose {
	public static int serialNumber(int day){
		if(day==1) {
			return 1;
		}
		else if(day==2) {
			return 2;
		}
		else {
			int p2=1;
			int p1=2;
			int lay=0;
			
			for(int i=3;i<=day;i++) {
				lay=2*p1+p2;
				p2=p1;
				p1=lay;
				}
				return lay;
			}			
			
			
			
		}public static void main(String[] args) {
			System.out.println("Enter the day:");
			Scanner sc=new Scanner(System.in);
			int day=sc.nextInt();
			if(day>0&&day<=30) {
				int egg=serialNumber(day);
				System.out.println("Number of eggs laid in "+day+"th day is "+egg);
			}
			else {
				System.out.println(day+" is a invalid day.");
			}
	}
}
