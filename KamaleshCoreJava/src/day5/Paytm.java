package day5;
import java.util.ArrayList;
public abstract class Paytm {
	private static ArrayList <String> transaction=new ArrayList <String>();
	public abstract void makePayment(double amount);
	public abstract void checkBalance(int pin);
	public void commenFeature(){
    System.out.println("Processing payment througt Paytm");
    }
	public void historyTransaction(String transDetails) {
		transaction.add(transDetails);}
	}


	
	