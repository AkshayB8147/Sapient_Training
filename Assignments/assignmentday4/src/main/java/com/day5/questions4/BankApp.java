package com.day5.questions4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BankApp {
	public BankApp(){
	
	}
	static Scanner sc=new Scanner(System.in);
	
	public String getCustomer(int customerId) {
		if(BankDB.bankDB.containsKey(customerId)) {
			return BankDB.bankDB.get(customerId).getName();
		}else {

			System.out.println("Customer not found");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter thr Customer Details to be added in database");
			System.out.println("Enter the Customer Id");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Customer Name");
			String cName=sc.nextLine();
			System.out.println("Enter the Customer Address");
			String cAddress=sc.nextLine();
			System.out.println("Enter the Account Balance");
			double accbal=sc.nextDouble();
			
			BankDB.bankDB.put(id,new BankCustomer(id,cName,cAddress,accbal));
			
			return "Account added";			
		}
	}
	
	public List<String> getByBal(double bal){
		List<String> customers=new ArrayList<String>();
		
		Set<Integer> keys=BankDB.bankDB.keySet();
//		BankCustomer b=BankDB.bankDB.get(keys);
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext()) {
			BankCustomer b=BankDB.bankDB.get(itr.next());
			if(b.getAccBal()==bal)
				customers.add(b.getDetails());
		}
		
		return customers;
		
	}
	
	public static void main(String[] args) {
		BankApp app=new BankApp();
		
		System.out.println("Enter the Customer Id");
		int customerId=sc.nextInt();
		System.out.println(app.getCustomer(customerId));
		
		System.out.println("Enter the Balance");
		double bal=sc.nextDouble();
		for(String customer: app.getByBal(bal)){
			System.out.println(customer);
		}
		
		
		
	}
}
