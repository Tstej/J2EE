package com.jspider.file_handling.charStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharStreamScan {
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("demo.txt");
		
		if(file.exists()) {
			
			Scanner sc = new Scanner(file);
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}else {
			System.out.println("File does not exist!");
		}
	}
}
