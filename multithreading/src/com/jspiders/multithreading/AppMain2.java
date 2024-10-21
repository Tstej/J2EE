package com.jspiders.multithreading;

import com.jspiders.multithreading.threadProperties.Mythread;


// Thread Properties
public class AppMain2 {
	
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Mythread());
		System.out.println("Thread 1 Id: " + thread1.threadId()); // threadId() method
		thread1.setName("Thread 1");  // setName() method
		thread1.setPriority(1);  // setPriority() method
		
		Thread thread2 = new Thread(new Mythread());
		System.out.println("Thread 2 Id: " + thread2.threadId());
		thread1.setName("Thread 2");
		thread1.setPriority(1);
		
		thread1.start();
		thread2.start();
		
	}

}
