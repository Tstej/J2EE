package com.jspiders.multithreading;

import com.jspiders.multithreading.threadCreation.Thread1;
import com.jspiders.multithreading.threadCreation.Thread2;


// Thread creation
public class AppMain1 {
	public static void main(String[] args) {
		
//		- As we know Runnable is Functional interface,
//		  which is consist of only one abstract method i.e run().
//		- And we should not call run method to start the execution of thread 
//		  because it will use only one stack to execute all threads.
//		- While when we call start() it will use different stacks with respect to each thread.
//		- Hence to call start() for Runnable interface we need to pass its reference
//		  to Thread constructor.
		
//		Syntax: new Thread(new RunnableThread).start();
		Thread1 t1 = new Thread1();
		Thread t = new Thread(t1);
		t.start();
		
		
//		start() is present inside Thread class
		Thread2 t2 = new Thread2();
		t2.start();
	}

}
