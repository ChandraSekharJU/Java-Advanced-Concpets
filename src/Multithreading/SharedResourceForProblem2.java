package Multithreading;

import java.util.*;

public class SharedResourceForProblem2 {
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResourceForProblem2(int bufferSize){
        sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int item){
        while(sharedBuffer.size() == bufferSize){
            try{
                System.out.println("Buffer is full, Producer is waiting for Consumer");
                wait();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        sharedBuffer.add(item);
        notify();
    }

    public synchronized int consumer(){
        while(sharedBuffer.isEmpty()){
            try {
                System.out.println("Buffer is empty, Consumer has to wait");
                wait();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        int item = sharedBuffer.poll();
        System.out.println("Consumed: "+ item);
        notify();
        return item;
    }


}
