package com.sapient.question3;

import java.util.List;

public interface CustomerDao {

	public Customer findCustomerById(int id);
	public String save(Customer c);
	public String update(int accountNo,double balance);
	public String delete(int customerId);
	public List<Customer> listAll();	
}
