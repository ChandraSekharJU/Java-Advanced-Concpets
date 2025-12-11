package Multithreading;

public class CreationOfMultiThreading2 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread Creation by extending the Thread Class");
        System.out.println("code executed by Thread: " + Thread.currentThread().getName());
    }
}
