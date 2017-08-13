package com.test.thread.producer.consumer.blockingqueue.java8;

import java.util.concurrent.BlockingQueue;
import java.util.function.Consumer;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class MyConsumer<T> {

	private BlockingQueue<T> sharedQueue;

	public MyConsumer(BlockingQueue<T> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	public void consume(Consumer<T> consumer) {
		try {
			consumer.accept(sharedQueue.take());

			// Simulate a long running process
			MILLISECONDS.sleep(1250);

		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}