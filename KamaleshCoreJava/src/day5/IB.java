package day5;

public class IB extends Gpay{
	private double balance=5000;
    private int pin=1234;
	@Override
	public void makePayment(double amount) {
		// TODO Auto-generated method stub
		if(amount<balance) {
			balance-=amount;
			String transaction="Payment of rs."+amount+" made using IB";
			recordTransaction(transaction);
		}
			}

	@Override
	public void checkBalance(int pin) {
		// TODO Auto-generated method stub
		if(this.pin==pin) {
			System.out.println("Your Balance is "+balance);
		}
		else {
			System.out.println("Invalid PIN");
		}
	}
	
	
}
