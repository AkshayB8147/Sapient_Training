package day2continue;

public class Shop extends Product{
public Shop(String productName) {
	super(productName);
}
public String getProductDetails() {
	return super.getProductName();
}
}
