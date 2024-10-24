package com.jspider.file_handling.charStream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamRead {
	public static void main(String[] args) throws IOException {
		
		File file = new File("demo.txt");
		
//		create variable to store read data from file
		String data = " ";
		
		if(file.exists()) {
//			To read data we use "FileReader" class
			FileReader fr = new FileReader(file);
			
//			Data will be read using read() method
//			This method will read only one byte at a time and at the end it will return -1
			
//			Hence we use loop to fetch all the characters present in the file
			int ascii = -1;
//			loop will continue until ASCII become -1
			while((ascii = fr.read()) != -1) {
				data += (char)ascii;     // Performing narrowing to get output in the form of characters i.e byte --> char
			}
			System.out.println(data);
			fr.close();
		}else {
			System.out.println("File does not exist!");
		}
		
		
		
		
	
	}

}
