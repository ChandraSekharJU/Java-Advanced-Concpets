import InterfaceExample.LambdaExpressionExample;
import InterfaceExample.TypesOfFnInterface;
import Multithreading.*;
import streamsEg.StreamsDiffIntermediateOperations;
import streamsEg.StreamsExample;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*QueueExample queueExample = new QueueExample();
        queueExample.createMinPriorityQueue();*/
//        MaxPriorityQueue maxPriorityQueueObj = new MaxPriorityQueue();
//        maxPriorityQueueObj.maxPriorityQueue();
//        System.out.println("------");
//        maxPriorityQueueObj.maxPriorityQueue("reversed the comparator lambda expression");
//
//        ArrayDequeExample arrayDequeExample = new ArrayDequeExample();
//        arrayDequeExample.createArrayDeque();
//
//        HashmapExample hashmapExample = new HashmapExample();
//        hashmapExample.createHashmap();
//
//        System.out.println("-------------");
//
//        LinkedHashmapExample linkedHashmapExample = new LinkedHashmapExample();
//        linkedHashmapExample.createLinkedHashmap();
//
//        StreamsExample streamsExample = new StreamsExample();
//        streamsExample.flatMapEg();
//        streamsExample.distingEg();
//
//        LambdaExpressionExample lambdaExpressionExample= new LambdaExpressionExample();
//        lambdaExpressionExample.lamdbaImpl1();
//
//        System.out.println();
//
//        TypesOfFnInterface typesOfFnInterface = new TypesOfFnInterface();
//        typesOfFnInterface.consumerExample.accept(3000);
//        typesOfFnInterface.consumerExample.accept(40000);
//        System.out.println(typesOfFnInterface.stringSupplier.get());
//        System.out.println(typesOfFnInterface.functionTypeExample.apply(12500));
//        int input = 2;
//        System.out.println("Is Number " + input + " is even: " + typesOfFnInterface.integerPredicate.test(input));
//        System.out.println();
//        StreamsDiffIntermediateOperations streamsDiffIntermediateOperations = new StreamsDiffIntermediateOperations();
//        streamsDiffIntermediateOperations.filterExample();
//        streamsDiffIntermediateOperations.mapFnExample();
//        streamsDiffIntermediateOperations.flatMapFnExample();
//        streamsDiffIntermediateOperations.distinctFnExample();
//        streamsDiffIntermediateOperations.sortedFnExample();
//        streamsDiffIntermediateOperations.peekFnExample();
//        streamsDiffIntermediateOperations.limitFnExample();
//        System.out.println();
//
//        System.out.println("Main Thread: " + Thread.currentThread().getName());
//
//        // Thread Creation 1
//        CreationOfMultiThreading1 runnable = new CreationOfMultiThreading1();
//        Thread thread1 = new Thread(runnable);
//        thread1.start();
//
//        //Thread Creation 2
//        CreationOfMultiThreading2 thread2 = new CreationOfMultiThreading2();
//        thread2.start();
//        System.out.println();
//
//        //Monitor Lock Example
//        /*MonitorLockExample obj = new MonitorLockExample();
//        Thread t1 = new Thread(() -> {obj.task1();});
//        Thread t2 = new Thread(() -> {obj.task2();});
//        Thread t3 = new Thread(() -> {obj.task3();});
//
//        t1.start();
//        t2.start();
//        t3.start();*/
//        System.out.println();
//
//       /* //Threading Example Realtime
//        SharedResource sharedResource = new SharedResource();
//        Thread producerThread = new Thread(() -> {
//            try{
//                Thread.sleep(2000);
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//            sharedResource.addItem();
//        });
//
//        Thread consumerThread = new Thread(() -> {
//            sharedResource.consumeItem();
//        });
//
//        consumerThread.start();
//        producerThread.start();*/
//
//        //Threading Example 2
//        System.out.println();
//        SharedResourceForProblem2 sharedResourceForProblem2 = new SharedResourceForProblem2(3);
//        Thread producerThread = new Thread(() -> {
//            for(int i = 0; i <= 6; i++){
//                sharedResourceForProblem2.produce(i);
//            }
//        });
//        Thread consumerThread = new Thread(() -> {
//            for(int i = 0; i <= 6; i++){
//                sharedResourceForProblem2.consumer();
//            }
//        });
//
//
//        producerThread.start();
//        consumerThread.start();
        ArrayDequeExample arrayDequeExample = new ArrayDequeExample();
        arrayDequeExample.frequencyCount(new int[]{1,2,3,4,1});
    }
}