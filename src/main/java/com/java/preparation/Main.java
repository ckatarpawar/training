package com.java.preparation;

public class Main {
    public static void main(String[] args) {
        java.util.concurrent.LinkedBlockingQueue<String> queue = new java.util.concurrent.LinkedBlockingQueue<>(3);
        Producer<String> producer = new Producer<>(queue);
        Consumer<String> consumer = new Consumer<>(queue);

        new Thread(() -> producer.produce("Message 1")).start();
        new Thread(() -> producer.produce("Message 2")).start();
        new Thread(() -> producer.produce("Message 3")).start();
        new Thread(() -> producer.produce("Message 4")).start();
        new Thread(() -> producer.produce("Message 5")).start();

        new Thread(consumer::consume).start();
        new Thread(consumer::consume).start();
        new Thread(consumer::consume).start();
        new Thread(consumer::consume).start();

    }
}
