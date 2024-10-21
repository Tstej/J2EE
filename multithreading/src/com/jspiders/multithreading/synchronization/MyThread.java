package com.jspiders.multithreading.synchronization;

public class MyThread extends Thread {

	private Resource1 resource1;

	public MyThread(Resource1 resourece1) {
		super();
		this.resource1 = resourece1;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			resource1.increment();
		}
	}

}
