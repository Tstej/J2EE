package com.jspiders.multithreading.ProducerConsumer;

public class AppMain {
	public static void main(String[] args) {

		Product product = new Product();

		Consumer consumer = new Consumer(product);
		Producer producer = new Producer(product);

		consumer.start();
		producer.start();

	}

}
