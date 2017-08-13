package com.test.thread.producer.consumer.custom.blockingqueue;

public class Producer implements Runnable {

	private final BlockingQueueCustom<Integer> sharedQueue;

	public Producer(BlockingQueueCustom<Integer> sharedQueue) {
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