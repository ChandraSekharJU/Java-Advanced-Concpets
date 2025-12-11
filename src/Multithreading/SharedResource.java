package Multithreading;

public class SharedResource {
    boolean isItemAvailable = false;

    public synchronized void addItem() {
            isItemAvailable = true;
        System.out.println("Producer method calling the notifyAll method");
            notifyAll();

    }

    public synchronized void consumeItem(){
        System.out.println("Consumer Thread Inside");
        while(!isItemAvailable){
            try{
                System.out.println("Consumer Thread is waiting");
                wait();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        isItemAvailable = false;
    }
}
