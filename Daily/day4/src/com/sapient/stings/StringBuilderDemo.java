package com.sapient.stings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder();
		sb.append("Shantanu").append(" Banerjee").append(" Hyderabad ").append(500058);
		System.out.println(sb);
		
		sb.replace(0,18, "Akshaykumar Bhandge");
		sb.delete(19,28);
		System.out.println(sb);

	}
}

