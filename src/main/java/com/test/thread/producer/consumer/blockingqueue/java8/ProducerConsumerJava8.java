package com.test.thread.producer.consumer.blockingqueue.java8;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ProducerConsumerJava8 {

	private static final int MSG_NBR = 10;

	private final BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

	public static void main(String[] args) {
		new ProducerConsumerJava8().startEngine();
	}

	public void startEngine() {
		startProducer();
		startConsumer();
	}

	// Producer thread
	private void startProducer() {

		final MyProducer<Integer> myProducer = new MyProducer<>(queue);
		// final Supplier<String> supplier = () -> "Hello World";
		new Thread(() -> {
			for (int i = 0; i < MSG_NBR; i++) {
				final Integer myInt = Integer.valueOf(i);
				Supplier<Integer> supplier = () -> myInt;
				myProducer.produce(supplier);
			}
		}).start();
	}

	// Consumer thread
	private void startConsumer() {

		final MyConsumer<Integer> myConsumer = new MyConsumer<>(queue);
		final Consumer<Integer> consumer = (s) -> System.out.println("Consumed message: " + s);
		new Thread(() -> {
			for (int i = 0; i < MSG_NBR; i++)
				
				myConsumer.consume(consumer);
		}).start();
	}

}
