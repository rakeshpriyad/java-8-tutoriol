package com.test.thread.producer.consumer.blockingqueue.java8;

import java.util.concurrent.BlockingQueue;
import java.util.function.Supplier;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class MyProducer<T> {

	private final BlockingQueue<T> sharedQueue;

	public MyProducer(BlockingQueue<T> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	public void produce(Supplier<T> supplier) {
		final T msg = supplier.get();
		try {
			sharedQueue.put(msg);
			System.out.println("Added message: " + msg);

			// Simulate a long running process
			MILLISECONDS.sleep(900);

		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}