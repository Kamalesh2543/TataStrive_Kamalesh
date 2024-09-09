package day9;

import java.util.Scanner;

public class MagicSum {
	public static boolean isPrime(int n) {
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter the array size:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size > 5 || size < 1) {
			System.out.println("Invalid size");
			return;
		}
		String result = "";
		int[] array = new int[size];
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < size; i++) {
			int cs = 0;

			array[i] = sc.nextInt();
			if (isPrime(array[i])) {

				for (int j = 2; j <= array[i]; j++) {
					if (isPrime(j)) {
						cs += j;
						if (cs == array[i]) {
							result += "\n" + cs;
						}else if (cs > array[i]) {
							break;
						}	
						
					}
				
				}
			}
		}
		System.out.println("The sum of Prime is  " + result);
	}

}
