package collections.app;

import java.util.HashMap;
import java.util.Map;

public class PersonDB {

	static Map<Integer, Person> personDB;
	static {
		personDB=new HashMap<Integer, Person>();
		personDB.put(101, new Person(101,"Akshay","Hubli"));
		personDB.put(102, new Person(102,"Vinay","Nargund"));
		personDB.put(103, new Person(103,"Vinayak","Mahalingapur"));
		personDB.put(104, new Person(104,"Arun","Kusagal"));
		personDB.put(105, new Person(105,"Amit","Hubli"));
		personDB.put(106, new Person(106,"Ganesh","Hubli"));
		personDB.put(107, new Person(107,"Krishna","Hubli"));
		personDB.put(108, new Person(108,"Shantveer","Ambajogai"));
		personDB.put(109, new Person(109,"Rohit","Karwar"));
		personDB.put(110, new Person(110,"Vijay","Kalgathagi"));
	}
	
}
