package com.test.thread.producer.consumer.custom.blockingqueue;
public class ProducerConsumerBlockingQueueCustom {
 
    public static void main(String args[]){
     
     BlockingQueueCustom<Integer> sharedQueue = new LinkedBlockingQueueCustom<Integer>(10); //Creating shared object
    
     Producer producer=new Producer(sharedQueue);
     Consumer consumer=new Consumer(sharedQueue);
    
     Thread producerThread = new Thread(producer, "ProducerThread");
     Thread consumerThread = new Thread(consumer, "ConsumerThread");
     producerThread.start();
     consumerThread.start();
    }
}
 