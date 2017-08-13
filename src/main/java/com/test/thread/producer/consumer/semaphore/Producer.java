package com.test.thread.producer.consumer.semaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

	private Semaphore semaphoreProducer;
	private Semaphore semaphoreConsumer;

	public Producer(Semaphore semaphoreProducer, Semaphore semaphoreConsumer) {
		this.semaphoreProducer = semaphoreProducer;
		this.semaphoreConsumer = semaphoreConsumer;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				semaphoreProducer.acquire();
				System.out.println("Produced : " + i);
				semaphoreConsumer.release();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}