package MultiThreading2;

public class SharedResourceTwo {
    boolean isItemAvailable = false;

    public synchronized void addItem() {
        System.out.println("Thread Invoked [addItem]: " + Thread.currentThread().getName());
        isItemAvailable = true;
        System.out.println("Producer Thread  Calling notifyAll()");
        notifyAll();
    }

    public synchronized void consumeItem() {
        System.out.println("Thread Invoked [consumeItem]: " + Thread.currentThread().getName());
        while (!isItemAvailable) {
            try{
                System.out.println("Consumer Thread is waiting");
                wait();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Consumer Thread got the item");
        isItemAvailable = false;
    }

}
