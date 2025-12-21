package MultiThreading;

public class ThreadCreation implements Runnable {
    @Override
    public void run() {
        System.out.println("code executed by Thread: "+Thread.currentThread().getName());
    }
//    Thread can be created using Runnable Interface or using Extending the Thread class
}
