package com.test.thread.producer.consumer.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
 
    private BlockingQueue<Integer> sharedQueue;
 
    public Consumer (BlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
 
    @Override
    public void run() {
        while(true){
         try {
           //take/consume from sharedQueue.
             System.out.println("CONSUMED : "+ sharedQueue.take());  
         } catch (InterruptedException ex) {
             
         }
        }
    }
 
 
}