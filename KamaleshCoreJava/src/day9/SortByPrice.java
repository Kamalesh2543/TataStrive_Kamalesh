package day9;

import java.util.Comparator;

public class SortByPrice implements Comparator<Product> {
	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.price,o2.price) ;

}
}
