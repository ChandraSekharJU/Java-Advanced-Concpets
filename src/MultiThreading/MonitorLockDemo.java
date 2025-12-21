package MultiThreading;

public class MonitorLockDemo {

    public synchronized void task1(){
        try{
            System.out.println("Thread Inside Task1");
            Thread.sleep(10000);
            System.out.println("Task1 completed");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void task2(){
        System.out.println("Thread Inside Task2 before synchronized");
        synchronized (this){
            System.out.println("Thread Inside Task2 inside synchronized");
        }
    }

    public void task3(){
        System.out.println("Inside Task 3");
    }
}
