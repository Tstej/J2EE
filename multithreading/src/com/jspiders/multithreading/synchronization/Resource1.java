package com.jspiders.multithreading.synchronization;

public class Resource1 {
	private int count;
	
	synchronized public void increment() {
		count++;
	}
	
	public int getCount() {
		return this.count;
	}
}
