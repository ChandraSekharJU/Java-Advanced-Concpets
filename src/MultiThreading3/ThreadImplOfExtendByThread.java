package MultiThreading3;

public class ThreadImplOfExtendByThread {
    public static void main(String[] args) {
        System.out.println("Main method: " + Thread.currentThread().getName());
        ThreadCreationByExtending threadCreationByExtending = new ThreadCreationByExtending();
        threadCreationByExtending.start();
    }
}
