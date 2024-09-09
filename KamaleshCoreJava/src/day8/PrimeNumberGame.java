package day8;

import java.util.Scanner;
public class PrimeNumberGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First array size:");
		int s1=sc.nextInt();
		validateSize(s1);
		int[] array1=new int[s1];		
		System.out.println("Enter the Elements in  first array");
		for(int i=0;i<array1.length;i++) {

			array1[i]=sc.nextInt();
			validateElement(array1[i]);
		}
		System.out.println("Enter the second array size:");
		int s2=sc.nextInt();
		validateSize(s2);
		if(s1!=s2) { }
		int[] array2 =new int[s2];
		System.out.println("Enter the Elements in  second array");
		for(int i=0;i<array2.length;i++) {
			
			array2[i]=sc.nextInt();
			validateElement(array2[i]);
		}
		int[] array3=new int[s1];
		for(int i=0;i<array1.length;i++) {
			array3[i]=array1[i]+array2[i];
			System.out.println(array3[i]);
		}
		int lastDigitAdd=0;
		for(int i=0;i<array1.length;i++) {
			lastDigitAdd+=array3[i]%10;
		}
		if(isPrime(lastDigitAdd)) {
			System.out.println(lastDigitAdd+" is a Prime number.");
		}else {
			System.out.println(lastDigitAdd+" is not a Prime number.");
		}
				
		
	}

	

	private static void validateSize(int s) {
		if(s<=0) {
			System.out.println("<size> size is an invalid array size");
			System.exit(1);
		}
		
	}

	private static void validateElement(int i) {
		if(i<0) {
			System.out.println("<arrValue> is an invalid input");
			System.exit(1);
		}
		
	}
	private static boolean isPrime(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
