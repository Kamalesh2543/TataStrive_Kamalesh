package day4;

public class EmployeeDemo {
	public static void main(String[] args) {
		
		Employee d1=new Developer("Rohith",1001,120000,"java");
		d1.displayDetails();
	    d1=new Manager("Kamal",1002,125000,"Testing");
		d1.displayDetails();
		
	}

}
