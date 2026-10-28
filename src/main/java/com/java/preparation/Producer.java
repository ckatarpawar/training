package com.java.preparation;

import java.util.concurrent.BlockingQueue;

public class Producer<K> {
    private BlockingQueue<K> queue;
    public Producer(BlockingQueue<K> queue) {
        this.queue = queue;
    }

    public void produce(K message) {
        try{
            System.out.println("Producer published message:  "+message);
            queue.put(message);
        } catch (InterruptedException e) {
            System.out.println("Producer thread interrupted while producing message.");
            Thread.currentThread().interrupt();
        }
    }
}
