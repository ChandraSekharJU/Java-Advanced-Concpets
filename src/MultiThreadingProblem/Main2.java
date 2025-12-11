package MultiThreadingProblem;

import MultiThreading2.SharedResourceTwo;

public class Main2 {
    public static void main(String[] args) {
        SharedResourceBuffer sharedResourceBuffer = new SharedResourceBuffer(3);
        Thread producerThread = new Thread(() -> {
            for (int i = 0; i < 6; i++) {
                try {
                    sharedResourceBuffer.addData(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread consumerThread = new Thread(()->{
            for (int i = 0; i <= 6; i++){
                try {
                    sharedResourceBuffer.consumeData();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        producerThread.start();
        consumerThread.start();
    }
}
