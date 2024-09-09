package day3;

public class Book {
	private String tittle;
    private	String author;

public Book(String tittle,String author){
	this.tittle=tittle;
	this.author=author;
	}
@Override
public String toString() {
	return "\nTittle=" + tittle +"\nAuthor=" + author;
}

}