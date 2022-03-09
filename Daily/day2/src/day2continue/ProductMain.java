package day2continue;

public class ProductMain {
public static void main(String[] args) {
	Shop shop=new Shop("Conrflakes");
	System.out.println(shop.getProductDetails());
	
	Product iphone=new Iphone("Iphone 13");
	System.out.println(iphone.getProductName());
	
	Product lamp=new NightLamp("Philpis Lamp");
	System.out.println(lamp.getProductName());
	
	
}
}
