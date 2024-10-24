package com.jspider.file_handling;

import java.io.File;

public class FetchProperties {
	public static void main(String[] args) {
		
		File file = new File("demo.txt");
		
//		To fetch path of file
		System.out.println(file.getAbsolutePath());
		
//		To fetch name of file
		System.out.println(file.getName());
		
//		To fetch no. of characters present
		System.out.println(file.length());
		
//		To check whether file is executable or not
		if(file.canExecute())
			System.out.println("File is executable.");
		else
			System.out.println("File is not executable.");
		
//		To check whether file is readable or not
		if(file.canRead())
			System.out.println("File is readable.");
		else
			System.out.println("File is not readable.");
		
//		To check whether file is writable or not
		if(file.canWrite())
			System.out.println("File is writable.");
		else
			System.out.println("File is not writable.");
			
	}

}
