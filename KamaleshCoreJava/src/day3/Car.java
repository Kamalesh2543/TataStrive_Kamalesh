package day3;

public class Car {
	String make;
	String model;
	int year;
	public Car(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public String displayDetails() {
		return "Make=" +make+", Model="+ model+ ", Year=" +year ;
	}
	@Override
	public String toString() {
		return  displayDetails();
	}
	
	}


