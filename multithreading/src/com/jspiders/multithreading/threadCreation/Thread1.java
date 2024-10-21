package com.jspiders.multithreading.threadCreation;


// 1. Creating a thread by implementing Runnable interface

public class Thread1 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Thread 1 Running");
		}

	}
}
