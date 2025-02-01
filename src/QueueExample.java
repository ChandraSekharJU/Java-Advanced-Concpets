import java.util.PriorityQueue;

public class QueueExample {
    //Queue - Follows the Data Structure of HEAP
    // Its of two types , Min Priority Queue & Max Priority Queue

    // Min Priority Queue
    public void createMinPriorityQueue() {
        // minPriorityQueue , used to solve problems of min heap
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.add(5);
        minPQ.add(2);
        minPQ.add(8);
        minPQ.add(1);

        minPQ.forEach((Integer val) -> System.out.println(val));

        // Poll -> Removes the top element
        while (!minPQ.isEmpty()){
            int val = minPQ.poll();
            System.out.println("removed from top:" +  val);
        }
    }

}
