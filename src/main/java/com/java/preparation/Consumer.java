package com.java.preparation;

import java.util.concurrent.BlockingQueue;

public class Consumer<K> {
    private BlockingQueue<K> queue;

    public Consumer(BlockingQueue<K> queue) {
        this.queue = queue;
    }

    public void consume() {
        try {
            K message = queue.take();
            System.out.println("Consumer consumed message:  "+message);
        } catch (InterruptedException e) {
            System.out.println("Consumer thread interrupted while consuming message.");
            throw new RuntimeException(e);
        }

    }
}
