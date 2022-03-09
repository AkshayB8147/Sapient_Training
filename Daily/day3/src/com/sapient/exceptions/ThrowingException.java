package com.sapient.exceptions;

import java.util.Scanner;

public class ThrowingException {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(true) {
		int age=sc.nextInt();
		try {
			if(age<21) {
				throw new RuntimeException(" "+age);
			} else {
				System.out.println("You are allowed");
			}
		}
		catch(RuntimeException e) {
			System.out.println("you are not allowed for underage "+e.getMessage() );
		}
	}
}
}
