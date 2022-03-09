package com.sapient.stings;

public class StringHandsOn {

	public static void main(String[] args) {
		String s1="Our java class is now suspended for next 30mins as we have a meeting for java progress";
		System.out.println(s1.length());
		System.out.println("First occurance at index: "+s1.indexOf("java")+"   and last occurance at index: "+s1.lastIndexOf("java")); 
		
		System.out.println("next appeared at index: "+ s1.indexOf("next"));
		
		System.out.println(s1.toUpperCase());
		
		
	}
	
}
/*String s1="Our java class is now suspended for next 30mins as we have a meeting for java progress"

do the following for s1:

length
first and last occurrance of java
extract "meeting for java" from ts1
find out where "next" has appeared for the first time

convert s1 to UpperCase
count the number of words in s1
*/