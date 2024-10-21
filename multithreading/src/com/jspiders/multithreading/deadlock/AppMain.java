package com.jspiders.multithreading.deadlock;

public class AppMain {
	public static void main(String[] args) {
		Resource r1 = new Resource();
		Resource r2 = new Resource();
		
		MyThread1 t1 = new MyThread1(r1, r2);
		MyThread2 t2 = new MyThread2(r1, r2);
		
		t1.start();
		t2.start();
	}

}
