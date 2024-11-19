package com.jspiders.serializeAndDeserialize;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {
	public static void main(String[] args) {
		
		User user = new User("Ram", "ram@gmail.com", "r123");
		
		File file = new File("demo.txt");
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		
		try {
			
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(user);
			System.out.println("Object has been serialize");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong");
		}finally {
			try {
				fileOutputStream.close();
				objectOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
