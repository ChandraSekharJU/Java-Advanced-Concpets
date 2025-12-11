package MultiThreading2;

public class Main {

    public static void main(String[] args){
        SharedResourceTwo sharedResourceTwo = new SharedResourceTwo();
        Thread producerThread = new Thread(() ->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedResourceTwo.addItem();
        });
        Thread consumerThread = new Thread(
                sharedResourceTwo::consumeItem
        );
        producerThread.start();
        consumerThread.start();
    }
}
