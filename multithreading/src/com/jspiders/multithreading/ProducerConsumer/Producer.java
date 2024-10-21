package com.jspiders.multithreading.ProducerConsumer;

import com.jspiders.multithreading.ProducerConsumer.Product;

public class Producer extends Thread {

	private Product product;

	public Producer(Product product) {
		super();
		this.product = product;
	}

	@Override
	public void run() {
		product.manufacture();
	}

}