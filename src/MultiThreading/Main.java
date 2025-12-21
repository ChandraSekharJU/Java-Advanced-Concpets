package MultiThreading;

public class Main {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();
        Thread producerThread = new Thread(() -> {
            obj.addItem();
        });
        Thread consumerThread = new Thread(() -> {
            obj.consumeItem();
        });

        producerThread.start();
        consumerThread.start();
    }
}
