package com.jspiders.multithreading.synchronization;

public class AppMain {
	public static void main(String[] args) throws InterruptedException {
		
		Resource1 r1 = new Resource1();
		
		MyThread t1 = new MyThread(r1);
		MyThread t2 = new MyThread(r1);
		
		t1.start();
		t2.start();
		
		Thread.sleep(1000);
		
		System.out.println(r1.getCount());
		
	}
}
