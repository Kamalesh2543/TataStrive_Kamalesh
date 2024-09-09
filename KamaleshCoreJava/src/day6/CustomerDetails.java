package day6;

public class CustomerDetails {
	private String customerName;
	private String phoneNumber;
	private String streetName;
	private double billAmount;
	private int distance;
	public CustomerDetails(String customerName, String phoneNumber, String streetName, double billAmount,
			int distance) {
		super();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.streetName = streetName;
		this.billAmount = billAmount;
		this.distance = distance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public double calculateBonusPoint() {
		if(billAmount>=250) {
			double amount =billAmount/10;
			return amount;
		}
	    else if(billAmount<250) {
			return 0;
		}
		return billAmount;		
		
	}
	
	public double deliveryCharge() {
		if(distance>=25) {
			return distance*8;
		}
		else if(distance>=15&&distance<25) {
			return distance*5;
		}
		else if(distance<15) {
			return distance*2;
		}
		return distance ;
	}
	@Override
	public String toString() {
		return "Customer name="+customerName+"\nPhone number="+phoneNumber+"\nStreet="
				+streetName+"\nBonus points"+calculateBonusPoint()+ "\nDelivery Charge="+deliveryCharge();
	}
	
	
	

}
