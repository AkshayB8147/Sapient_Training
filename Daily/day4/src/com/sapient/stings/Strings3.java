package com.sapient.stings;

public class Strings3 {
public static void main(String[] args) {
	String s1="Our java class is now suspended for next 30mins as we have a meeting for java progress";
	System.out.println(s1.substring(s1.indexOf("meeting for"),s1.lastIndexOf(" progress")));
}
}
 