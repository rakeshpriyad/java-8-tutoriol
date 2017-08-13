package com.test.thread.producer.consumer.waitnotify.when.productionisover;
import java.util.LinkedList;
import java.util.List;
 
/**
 * Producer Class in java, Producer will allow consumer to
 * consume only when 10 products have been produced
 * (i.e. when production is over).
 */
public class Producer implements Runnable{
 
    List<Integer> sharedQueue;
    
    public Producer(){
           sharedQueue=new LinkedList<Integer>();
    }
    
    @Override
    public void run(){
           
           synchronized (this) {
                  for(int i=1;i<=10;i++){ //Producer will produce 10 products
                        sharedQueue.add(i);
                        System.out.println("Producer is still Producing, Produced : "+i);
                        
                        try{
                               Thread.sleep(1000);
                        }catch(InterruptedException e){e.printStackTrace();}
                  
                  }
                  System.out.println("Production is over, consumer can consume.");
                  //Production is over, notify consumer thread so that consumer can consume.
                  this.notify();    
           }
    }
    
}