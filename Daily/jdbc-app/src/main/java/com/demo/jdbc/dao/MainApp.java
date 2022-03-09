package com.demo.jdbc.dao;

import java.util.Arrays;
import java.util.List;

public class MainApp {
public static void main(String[] args) {
	EmpDao dao = new EmpDaoJdbcImpl();

	Emp emp = dao.findById(105);
	System.out.println(emp);
	
	//String response=dao.save(new Emp(107, "Dinesh", "Hyderabad", 65000));
	//System.out.println(response);
	/*
	 * for(Emp e:dao.listAll()) { System.out.println(e); }
	 */
//	List<Emp> empList=dao.listAll();
//	
//	empList.stream().filter(emp->emp.getEmpSal()>80000).forEach(System.out::println);
//	empList.stream().filter(emp->emp.getEmpSal()<80000).forEach(e->System.out.println(e.getEmpName()));
//	
//	empList.stream().filter(emp->emp.getEmpSal()<80000).map(e->e.getEmpName()).forEach(System.out::println);
//	
//	
//	List<String> list=Arrays.asList("Shantanu","John","Peter","Robin","Kirthi","Soham","Jonny","Sheetal","Shankar");
//	
//	list.stream().filter(name->name.length()>5).forEach(System.out::println);
}
}
