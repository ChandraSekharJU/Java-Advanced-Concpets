import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

    void createHashmap(){
        Map<Integer, String> integerStringMap = new HashMap<>();
//    If we have not given a specific size by default it will take 16
        integerStringMap.put(null, "Test");
        integerStringMap.put(0, null);
        integerStringMap.put(1, "A");
        integerStringMap.put(2, "B");

        integerStringMap.putIfAbsent(null, "CHANGING TEST");
        integerStringMap.putIfAbsent(0, "Test");
        integerStringMap.putIfAbsent(3, "C");

        for(Map.Entry<Integer, String> entryMap: integerStringMap.entrySet()){
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();
            System.out.println("Key: "+ key + " Value: " + value);
        }
    }
}
