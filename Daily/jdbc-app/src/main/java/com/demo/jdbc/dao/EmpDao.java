package com.demo.jdbc.dao;

import java.util.List;

public interface EmpDao {

	public Emp findById(int empId);
	
	public String save(Emp e);
	
	public String update(Emp e);
	
	public String delete(Emp e);
	
	public List<Emp> listAll();
	
}
