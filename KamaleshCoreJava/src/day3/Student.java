package day3;

public class Student {
	private String name;
	private int grade;
	
public Student() {
	
}
public Student(String name,int grade) {
	this.name=name;
	this.grade=grade;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getGrade() {
	return grade;
}
public void setGrade(int grade) {
	this.grade = grade;
}
@Override
public String toString() {
	return  "\nName:" + name + "\nGrade:" + grade;
}}

