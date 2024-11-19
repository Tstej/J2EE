package com.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Messanger {

	private File file;

	private FileInputStream fi;
	private FileOutputStream fo;
	private ObjectInputStream oi;
	private ObjectOutputStream op;

	
//	Deserialization
	public void send(String message) throws IOException {
			file = new File("demo.txt");
			
			if(!(file.exists())) {
				file.createNewFile();
			}
			
			fo = new FileOutputStream(file);
			op = new ObjectOutputStream(fo);
			op.writeObject(message);
		}
	
//	Serialization
	public String receive() throws IOException, ClassNotFoundException {
		file = new File("demo.txt");
		
		if(!(file.exists())) {
			file.createNewFile();
		}
		
		fi = new FileInputStream(file);
		oi = new ObjectInputStream(fi);
		
		return (String) oi.readObject();
		
	}
}




