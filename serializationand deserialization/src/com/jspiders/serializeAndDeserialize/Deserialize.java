package com.jspiders.serializeAndDeserialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {
	public static void main(String[] args) {
		
		File file = new File("demo.txt");
		
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		
		try {
			fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);
			
//			Downcast the object
			User user = (User) objectInputStream.readObject(); 
			System.out.println(user);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				fileInputStream.close();
				objectInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
