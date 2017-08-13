package com.test.thread.producer.consumer.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private final BlockingQueue<Integer> sharedQueue;

	public Producer(BlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println("Produced : " + i);
				// put/produce into sharedQueue.
				sharedQueue.put(i);
			} catch (InterruptedException ex) {

			}
		}
	}

}