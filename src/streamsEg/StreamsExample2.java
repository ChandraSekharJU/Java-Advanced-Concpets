package streamsEg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample2 {
    //For example I have a list & i want to do an operatiion where I want to count the number of emp who are having the salary > 30000

    //Generic process:
    public void withNormalLoop(){
        List<Integer> list = new ArrayList<>();
        list.add(10000);
        list.add(20000);
        list.add(50000);
        list.add(5000);
        list.add(56000);
        int count = 0;
        for(Integer  i: list){
            if(i > 30000){
                count++;
            }
        }
        System.out.println("Count of employees who are having salary > 30000: "+count);
    }

    //Using Streams
    // Streams is Java 8 Feature
    public void withStreamsImpl(){
        List<Integer> list = new ArrayList<>();
        list.add(10000);
        list.add(20000);
        list.add(50000);
        list.add(5000);
        list.add(56000);

        long count = list.stream().filter((Integer sal) -> sal>30000).count();
        System.out.println("Count Using Streams of employees who are having salary > 30000: "+count);
    }


    public void typesOfStreamCreation(){

        //1) creation of Stream from Collection
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);

       Stream<Integer> stream =  collection.stream();

       //2) Using the Arrays.stream
        //Suppose I have only the Array of Object/datatype
        //I want to create a stream for that datatype , I can pass that data to the Arrays.stream()
        Integer[] intArray = {1,2,3,4,5,6};
        Stream<Integer> integerStream = Arrays.stream(intArray);

        //3) Using static method Stream.of()
        //Here in the of method we can pass the variable args
        //of method uses the Varargs concept
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7);

        //4) Using the StreamBuilder
        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(1).add(2).add(3);
        Stream<Integer> stream2 = streamBuilder.build();

        //5) Using the Stream.iterate method
        Stream<Integer> stream3 = Stream.iterate(1, (Integer i) -> i+1).limit(4);

    }
}
