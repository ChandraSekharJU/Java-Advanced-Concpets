package streamsEg;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public void flatMapEg(){
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Geeks", "for"),
                Arrays.asList("Geeks", "A Computer Portal"),
                Arrays.asList("Java", "Programming")
        );

        listOfLists.stream().flatMap((List<String> list) -> list.stream()).forEach(System.out::println);
    }

    public void distingEg(){
        Integer[] arr = {1,2,2,3,4,5,6};
        Arrays.stream(arr).distinct().forEach((Integer num) -> System.out.println(num));

    }
}
