package streamsEg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDiffIntermediateOperations {
    /**
     * Intermediate Operations of Streams
     * 1) filter() -> Used to filters the element -> Accepts the Predicate in the method as parameter
     * 2) map() -> Used to transform each element -> Accepts the (function) type of Functional Interface as input parameter
     * 3) flatMap() -> Used for cases if we have complex List like List of List Objects, Accepts the (function) type of Functional Interface as input parameter
     * 4) distinct() -> Removes duplicate from the stream
     * 5) peek() -> used to see the intermediate result of stream which is getting processed
     * 6) limit() -> Truncate the stream to the limit given
     * 7) skip() -> similar to limit(), skips the first n numbers
     * 8) mapToInt()
     * 9) mapToLong()
     * 10) mapToFloat()
     */

    List<List<String>> listOfStrings = Arrays.asList(Arrays.asList("I", "LOVE", "JAVA"), Arrays.asList("IT", "IS", "INTERESTING"));
    Integer[] arIntegers = {1,1,2,2,3,4,5};
    Integer[] unSortedIntegers = {1,8,2,10,3,4,5};
    String[] strings = {"HI", "HOW", "ARE", "YOU","DOING", "TODAY"};

    public void filterExample(){
        String[] strings = {"HI", "HOW", "ARE", "YOU","DOING", "TODAY"};
        Stream<String> stringStream = Arrays.stream(strings);
        List<String> filteredStream =  stringStream.filter((String inputStr) -> inputStr.length() > 3).toList();
        for(String str: filteredStream){
            System.out.println(str);
        }
    }

    public void mapFnExample(){
        String[] strings = {"HI", "HOW", "ARE", "YOU","DOING", "TODAY"};
        Stream<String> stringStream = Arrays.stream(strings);
        List<String> convertedArray = stringStream.map((String input) -> input.toLowerCase()).toList();
        for(String str: convertedArray){
            System.out.println(str);
        }
    }

    public void flatMapFnExample(){
        Stream<String> stringStream = listOfStrings.stream().flatMap((List<String> str) -> str.stream());
        List<String> stringList =  stringStream.toList();
        for(String str: stringList){
            System.out.println(str);
        }
    }

    public void distinctFnExample(){
        List<Integer> distinctIntegers = Arrays.stream(arIntegers).distinct().toList();
        for(Integer i: distinctIntegers){
            System.out.println(i);
        }
    }

    public void sortedFnExample(){
        Stream<Integer> sortedStreamAsc = Arrays.stream(unSortedIntegers).sorted();
        Stream<Integer> sortedStreamDesc = Arrays.stream(unSortedIntegers).sorted((Integer value1, Integer value2) -> value2-value1);
        System.out.println("Ascending Sorting");
        for(Integer integer: sortedStreamAsc.toList()){
            System.out.println(integer);
        }
        System.out.println("Descenting Sorting");
        for(Integer integer: sortedStreamDesc.toList()){
            System.out.println(integer);
        }
    }

    public void peekFnExample(){
        Stream<String> stringStream = Arrays.stream(strings).filter((String str) -> str.length() < 3).peek((String str) -> System.out.println(str));
        List<String> list = stringStream.toList();
    }

    public void limitFnExample(){
        Stream<String> stringStream = Arrays.stream(strings).limit(2);
        List<String> strList = stringStream.toList();
        for(String str: strList){
            System.out.println(str);
        }
    }
}
