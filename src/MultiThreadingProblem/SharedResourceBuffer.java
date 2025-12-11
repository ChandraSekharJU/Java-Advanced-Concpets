package MultiThreadingProblem;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class SharedResourceBuffer {
    private Queue<Integer> buffer;
    private int bufferSize;

    SharedResourceBuffer(int bufferSize){
        buffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void addData(int item) throws InterruptedException {
        System.out.println("Producer Adding Data");
        while(buffer.size() == bufferSize){
            System.out.println("Buffer Size is full so please wait!");
            wait();
        }
        buffer.add(item);
        System.out.println("Produced item: " + item);
        notify();
    }

    public synchronized int consumeData() throws InterruptedException {
        System.out.println("Consumer called consumeData");
        while(buffer.isEmpty()){
            System.out.println("No Data present in the buffer so please wait!");
            wait();
        }
        int item = buffer.poll();
        System.out.println("Consumer Item: " + item);
        notify();
        return item;
    }
}
