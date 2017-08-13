package com.test.thread.producer.consumer.custom.blockingqueue;

public class Consumer implements Runnable {

	private BlockingQueueCustom<Integer> sharedQueue;

	public Consumer(BlockingQueueCustom<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				// take/consume from sharedQueue.
				System.out.println("CONSUMED : " + sharedQueue.take());
			} catch (InterruptedException ex) {

			}
		}
	}
}