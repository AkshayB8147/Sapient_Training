package collections.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.List;

public class PersonApp {
	Map<Integer, Person> personDB;
	public PersonApp() {
		personDB=new HashMap<Integer, Person>();
		personDB.put(101, new Person(101,"Akshay","Hubli"));
		personDB.put(102, new Person(102,"Vinay",""));
		personDB.put(103, new Person(103,"Vinayak","Harihar"));
		personDB.put(104, new Person(104,"Arun","Kusagal"));
		personDB.put(105, new Person(105,"Amit","Hubli"));
		personDB.put(106, new Person(106,"Ganesh","Hubli"));
		personDB.put(107, new Person(107,"Krishna","Hubli"));
		personDB.put(108, new Person(108,"Shantveer","Ambajogai"));
		personDB.put(109, new Person(109,"Rohit","Karwar"));
		personDB.put(110, new Person(110,"Vijay","Kalgathagi"));
	}
	
	public String findPerson(int personId) {
		if(personDB.containsKey(personId)) 
			return personDB.get(personId).getName();
		else
			return "No Person Found";
	}
	
	public List<String> listPersonBy(String personCity){
		
		List<String> persons=new ArrayList<String>();
		Set<Integer> keys=personDB.keySet();
		
		for(Integer key:keys) {
			Person p=personDB.get(key);
			if(p.getCity().equals(personCity))
				persons.add(p.getDetails());
		}
		return persons;
	}
	
	public static void main(String[] args) {
		PersonApp app=new PersonApp();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID");
		int personId=sc.nextInt();
		sc.nextLine();
		System.out.println(app.findPerson(personId));
		
		System.out.println("Enter the City");
		String personCity=sc.nextLine();
		
		for(String p: app.listPersonBy(personCity)) 
			System.out.println(p);
		
		
		
	}
}
