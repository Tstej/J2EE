package com.jspider.file_handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		
		File file = new File("demo.txt");
		
		// createNewFile() method is use to create new file.
		boolean created = file.createNewFile();
		if(created)
			System.out.println("File is created.");
		else
			System.out.println("File is not created.");
	}

}
