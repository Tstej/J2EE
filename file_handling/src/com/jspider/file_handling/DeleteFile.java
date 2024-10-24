package com.jspider.file_handling;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		
		File file = new File("demo.txt");
		
//		exists() method is used to check whether file is exists or not
		if(file.exists()) {
			
//			delete() method is used to delete the existed file
			boolean deleted = file.delete();
			
			if(deleted)
				System.out.println("File is deleted.");
			else
				System.out.println("File is not deleted.");
		}else {
			System.out.println("File does not exists. ");
		}
			
		
	}

}
