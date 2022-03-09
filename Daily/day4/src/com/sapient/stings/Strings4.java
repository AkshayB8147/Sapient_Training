package com.sapient.stings;

public class Strings4 {
public static void main(String[] args) {
	String s1="Our java class is now suspended for next 30mins as we have a meeting for java progress";
	int words=0;
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)==' ') {
			words++;
		}
	}
	words++;
	System.out.println(words);
}
}
