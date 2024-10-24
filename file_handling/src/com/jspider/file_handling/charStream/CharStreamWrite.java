package com.jspider.file_handling.charStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamWrite {
	public static void main(String[] args) {

		File file = new File("demo.txt");

//		Check whether file does exist or not
		if (!(file.exists())) {
			try {
//				If file does not exist then create
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

//		To write in file use "FileWriter" class 
		FileWriter fw = null;

		try {
//			create object of it and pass file reference
			fw = new FileWriter(file);
//			to pass data use write() method
			fw.write("Java is Programming Langauage");
			System.out.println("Data has been written to a file.");

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Something went wrong!");
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
