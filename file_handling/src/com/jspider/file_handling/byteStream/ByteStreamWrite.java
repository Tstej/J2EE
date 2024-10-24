package com.jspider.file_handling.byteStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;

public class ByteStreamWrite {
	public static void main(String[] args) throws IOException {
		
		File  file = new File("demo1.txt");
		
		if(!(file.exists())) {
			file.createNewFile();
		}
		
		FileOutputStream fo = new FileOutputStream(file);
		DataOutputStream data = new DataOutputStream(fo);
		
		data.writeInt(1000);
		System.out.println("Data written to a File.");
	}
}
