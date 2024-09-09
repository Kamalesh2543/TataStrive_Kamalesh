package day1;

public class Product {
	private  String name;
	private double price;
	private int quantity;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	public String getName() {
		return name;
		
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void printProductDetails()
	{	
		System.out.println("Product Details"+"\n"+"Name:"+getName()+"\n"+"Price:"+getPrice()+"\n"+"Quantity:"+getQuantity());
	}

}
