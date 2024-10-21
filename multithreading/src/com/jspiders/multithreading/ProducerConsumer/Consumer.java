package com.jspiders.multithreading.ProducerConsumer;

public class Consumer extends Thread {

	private Product product;

	public Consumer(Product product) {
		super();
		this.product = product;
	}

	@Override
	public void run() {
		try {
			product.order();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}