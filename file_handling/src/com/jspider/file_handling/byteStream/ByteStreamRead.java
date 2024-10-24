package com.jspider.file_handling.byteStream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ByteStreamRead {
	public static void main(String[] args) throws IOException {
		
		File file = new File("demo1.txt");
		
		if(file.exists()) {
			
			FileInputStream fi = new FileInputStream(file);
			DataInputStream data = new DataInputStream(fi);
			
			System.out.println(data.readInt()); 
		
			
		}
	}
}
