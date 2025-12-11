package MultiThreading3;

public class ThreadCreationStartByRunnable {
    //In this we will see the Step2 of Thread Creation using Runnable

    public static void main(String[] args) {
        System.out.println("inside main method: "+Thread.currentThread().getName());

//        Create the Runnable object which is created by implementing the Runnable Interface
        ThreadCreation threadCreation = new ThreadCreation();

//        Pass the Runnable Object to Thread class
        Thread thread = new Thread(threadCreation);
        thread.start();
        System.out.println("Finish main method: " + Thread.currentThread().getName());
    }
}
