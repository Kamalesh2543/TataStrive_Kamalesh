package day3;

public class Rectangle {
	private double length;
	private double width;
	private double area;
public Rectangle(double length,double width) {
	this.length=length;
	this.width=width;
	this.area=area;
}
public Rectangle(double length) {
	this.length = length;
	this.width=1;
}
public double area(){
	 return area=length*width;
}
@Override
public String toString() {
	return "Length="+length+"\nWidth="+width+"\nRectangle Area="+ area();
}

}

