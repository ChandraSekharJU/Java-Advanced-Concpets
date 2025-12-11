package Multithreading;

public class MonitorLockExample {

    public synchronized void task1(){
        try{
            System.out.println("inside Task1");
            Thread.sleep(10000);
            System.out.println("task1 completed");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void task2(){
        System.out.println("task2, but before synchronized");
        synchronized (this) {
            System.out.println("task2, after synchronized");
        }

    }

    public void task3(){
        System.out.println("task3");
    }
}
