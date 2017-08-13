package com.test.thread.producer.consumer.waitnotify.when.productionisover;

public class Consumer extends Thread {
	private Producer prod;

	public Consumer(Producer obj) {
		prod = obj;
	}

	public void run() {
		/*
		 * consumer will wait till producer is producing.
		 */
		synchronized (this.prod) {

			System.out.println("Consumer waiting for production to get over.");
			try {
				this.prod.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		/* production is over, consumer will start consuming. */
		int productSize = this.prod.sharedQueue.size();
		for (int i = 0; i < productSize; i++){
			System.out.println("CONSUMED : " + this.prod.sharedQueue.remove(0) + " ");
		}

	}

}