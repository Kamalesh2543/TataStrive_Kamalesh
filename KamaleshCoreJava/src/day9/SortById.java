package day9;

import java.util.Comparator;

public class SortById implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.productId-o2.productId;
	}
	

}
