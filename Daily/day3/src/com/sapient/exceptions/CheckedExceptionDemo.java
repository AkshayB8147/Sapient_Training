package com.sapient.exceptions;

import java.io.IOException;

public class CheckedExceptionDemo {
	public void readInput() {
		try {
			int data=System.in.read();
		}
		catch(IOException io) {
			System.out.println(io.fillInStackTrace());
		}
	}
	
	public static void main(String[] args) {

}
}
