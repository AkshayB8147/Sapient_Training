package com.sapient.assignment;

import java.util.Scanner;

public class CustomerMain {

	
	

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		Customer[] c=new Customer[5];
		c[0]=new Customer(110,"Akshay","A10","Hubli",580024);
		c[1]=new Customer(111,"Saturo","B20","Dragon",580035);
		c[2]=new Customer(112,"SonGoku","C30","Demon",580040);
		c[3]=new Customer(113,"Naruto","D40","Uchiha",580022);
		c[4]=new Customer(114,"Eren","E50","Titan",580024);

		for (Customer customer : c) {
			System.out.println(customer.getCustomerDetails());
		}
		

//		for (int i = 0; i < 5; i++) {
//			System.out.println(c[i].getCustomerDetails());
//		}	
		
//		for (int i=0;i<5;i++) {
//			int customerId=sc.nextInt();
//			sc.nextLine();
//			String customerName=sc.nextLine();
//			String dooNo=sc.nextLine();
//			String city=sc.nextLine();
//			int pinCode=sc.nextInt();
//			customer[i] = new Customer(customerId, customerName, dooNo, city, pinCode);
//		}
		
//	public static void getCustomerDetails(){
//		
//		for(int i=0;i<5;i++) {
//			System.out.println();
//		}
//	
//	}
//	public static void updateShippingAddress() {
//		
//	}
	}

}
