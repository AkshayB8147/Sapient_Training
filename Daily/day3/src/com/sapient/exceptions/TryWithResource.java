package com.sapient.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("sample.txt")){
			int a=0;
			while((a=fis.read())!= -1) {
				System.out.println((char) a);
			}
		} catch (FileNotFoundException fe) {
			System.out.println("File not Found");
		} catch (IOException io) {
			System.out.println(io);
		}

	}

}
