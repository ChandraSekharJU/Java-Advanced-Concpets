import java.util.PriorityQueue;

/**
 * Example for MaxPriorityQueue
 * Uses MaxHeap
 * For a PriorityQueue, if we dont give any comparator, then it will be min Priority Queue which uses the minHeap
 * If we pass the comparator to the constructor of PriorityQueue then it will be MaxPriorityQueue based on MaxHeap
 */
public class MaxPriorityQueue {

    public void maxPriorityQueue(){
        PriorityQueue<Integer> maxPq = new PriorityQueue<>((Integer v1, Integer v2) -> v2-v1);
        maxPq.add(8);
        maxPq.add(5);
        maxPq.add(2);
        maxPq.add(1);
        maxPq.add(10);

        maxPq.forEach((Integer val) -> System.out.println(val));
    }

    public void maxPriorityQueue(String input){
        PriorityQueue<Integer> maxPq = new PriorityQueue<>((Integer v1, Integer v2) -> v1-v2);
        maxPq.add(8);
        maxPq.add(5);
        maxPq.add(2);
        maxPq.add(1);
        maxPq.add(10);

        maxPq.forEach((Integer val) -> System.out.println(val));
    }
}
