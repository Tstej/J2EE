package com.jspiders.multithreading.deadlock;

public class MyThread1 extends Thread {
	private Resource resource1;
	private Resource resource2;
	
	
	public MyThread1(Resource resource1, Resource resource2) {
		super();
		this.resource1 = resource1;
		this.resource2 = resource2;
	}
	
	@Override
	public void run() {
		synchronized (resource1){
			System.out.println("Thread 1 has lock assigned on Resource 1 ");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(resource2) {
				System.out.println("Thread 1 has lock assigned on Resource 2");
			}
		}
	}
	
}
