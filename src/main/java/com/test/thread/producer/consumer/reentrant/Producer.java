package com.test.thread.producer.consumer.reentrant;

import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable {

	private List<Integer> sharedQueue;
	private int maxSize = 2; // maximum number of products which sharedQueue can
								// hold at a time.

	private Lock lock;
	private Condition producerCondition;
	private Condition consumerCondition;

	public Producer(List<Integer> sharedQueue, Lock lock, Condition producerCondition, Condition consumerCondition) {
		this.sharedQueue = sharedQueue;
		this.lock = lock;
		this.producerCondition = producerCondition;
		this.consumerCondition = consumerCondition;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) { // produce 10 products.
			try {
				produce(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void produce(int i) throws InterruptedException {
		lock.lock();

		// if sharedQuey is full producer await until consumer consumes.
		if (sharedQueue.size() == maxSize) {
			producerCondition.await();
		}

		System.out.println("Produced : " + i);
		// as soon as producer produces (by adding in sharedQueue) it signals
		// consumer.
		sharedQueue.add(i);
		consumerCondition.signal();

		lock.unlock();

	}

}