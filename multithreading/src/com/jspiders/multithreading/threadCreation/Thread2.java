package com.jspiders.multithreading.threadCreation;


// 1. Creating a thread by extending Thread class

public class Thread2 extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println("Thread 2 Running");
		}
	}

}
