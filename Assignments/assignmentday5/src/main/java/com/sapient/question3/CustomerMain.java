package com.sapient.question3;

//import java.util.List;

public class CustomerMain {
	public static void main(String[] args) {
		CustomerDao customer=new CustomerDaoJdbcImpl();
	
		Customer c=customer.findCustomerById(1004);
		System.out.println(c);
//
//		String response=customer.save(new Customer(1011, "Vinayak", "Bangalore", 100400444, 20000.0));
//		System.out.println(response);
		
//		String response=customer.update(100100567,3000.0);
//		System.out.println(response);
		
//		String response=customer.delete(1011);
//		System.out.println(response);
		
//		for (Customer cust : customer.listAll()) {
//			System.out.println(cust);
//		}
		
		
	}
}
