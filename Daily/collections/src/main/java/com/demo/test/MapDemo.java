package com.demo.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> names=new HashMap<Integer, String>();
		names.put(426, "Akshay");
		names.put(427, "Ganesh");
		names.put(428, "Krishna");
		names.put(429, "Arun");
		names.put(430, "Vinay");
		names.put(431, "Amit");
		
		System.out.println(names);
		
		System.out.println(names.get(428));
		
		System.out.println(names.containsKey(428));
		
		Set<Integer> keys=names.keySet();
		
		for(Integer key: keys) {
			System.out.println(key+"--------->"+names.get(key));
		}
	}

}
