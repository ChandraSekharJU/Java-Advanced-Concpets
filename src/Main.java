import streamsEg.StreamsExample;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*QueueExample queueExample = new QueueExample();
        queueExample.createMinPriorityQueue();*/
        MaxPriorityQueue maxPriorityQueueObj = new MaxPriorityQueue();
        maxPriorityQueueObj.maxPriorityQueue();
        System.out.println("------");
        maxPriorityQueueObj.maxPriorityQueue("reversed the comparator lambda expression");

        ArrayDequeExample arrayDequeExample = new ArrayDequeExample();
        arrayDequeExample.createArrayDeque();

        HashmapExample hashmapExample = new HashmapExample();
        hashmapExample.createHashmap();

        System.out.println("-------------");

        LinkedHashmapExample linkedHashmapExample = new LinkedHashmapExample();
        linkedHashmapExample.createLinkedHashmap();

        StreamsExample streamsExample = new StreamsExample();
        streamsExample.flatMapEg();
        streamsExample.distingEg();
    }
}