package day2;

public class StudentData {
	private int id;
	private static int nextid;
	private String name;
	private static String centre;
	private static String country;
	public StudentData() {
	}
	public StudentData(String name) {
		id=++nextid;
		this.name = name;
	}
	static {
		centre="Tata STRIVE";
		country="India";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getId() {
		return id;
	}
	public static String getCentre() {
		return centre;
	}
	public static String getCountry() {
		return country;
	}
	@Override
	public String toString() {
		return "ID:"+id+"\nName:"+name+"\nCentre:"+centre+"\nCountry"+country;
	}
	
}
