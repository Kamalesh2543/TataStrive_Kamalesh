package day5;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		IB ib=new IB();
		SBI sbi=new SBI();
		Gpay gpay=sbi;
		Scanner sc=new Scanner(System.in);
		int ch=0;
		do{
			
		System.out.println("User interface\n---------------------");
        System.out.println("1.Make payment");
		System.out.println("2.Check Balance");
		System.out.println("3.Show History");
		System.out.println("4.Switch Account");
		System.out.println("5.Exit");
		ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter the amount:");
			double amount=sc.nextDouble();
			gpay.makePayment(amount);
			break;
		case 2:
			System.out.println("Enter the PIN");
			int pin=sc.nextInt();
			gpay.checkBalance(pin);
			break;
		case 3:
			System.out.println("Transaction Details\n-----------------");
			gpay.showHistory();
			break;
		case 4:
			System.out.println("Select the account \n1.IB\n2.SBI");
			int ch2=sc.nextInt();
			if (ch2==1) {
				gpay=ib;
				System.out.println("Gpay is switched to IB Bank");
			}
			else if(ch2==2){
				gpay=sbi;
				System.out.println("Gpay is switched to SBI Bank");
			}
		    break;
		case 5:
			System.out.println("Thank you for using Gpay");
			break;
		default:
			System.out.println("Invalid option");
			
			
		}
	        }while(ch!=5);

}
}