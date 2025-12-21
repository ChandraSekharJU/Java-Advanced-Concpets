package MultiThreading;

//Create a Thread Sub Class by extending Thread class
//Override the run method that tells which task Thread has to do
public class ThreadCreationByExtending extends Thread {

    @Override
    public void run() {
        System.out.println("Thread Sub Class: "+Thread.currentThread().getName());
    }
}
