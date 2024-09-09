package day5;

import java.util.ArrayList;

public abstract class Gpay {
	private static ArrayList <String> transaction=new ArrayList<String>();
	public  abstract void makePayment(double amount);
	public  abstract void checkBalance(int pin);
	public void commonFeature() {
		System.out.println("Processing payment in through Gpay platform.");
	}
	public void recordTransaction(String transDetails) {
		transaction.add(transDetails);
	}
	public void showHistory() {
		transaction.forEach(s->System.out.println(s));
	}
}
