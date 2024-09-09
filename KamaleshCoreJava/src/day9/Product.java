package day9;

public class Product {
	public int productId;
	public String productName;
	public double price;
	
	public Product() {
		
	}
	public Product(int productId,String productName,double price) {
		this.productId=productId;
		this.productName=productName;
		this.price=price;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProdutId(int productId) {
		this.productId=productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}
	
	
}
