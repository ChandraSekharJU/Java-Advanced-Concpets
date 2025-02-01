import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmapExample {
    void createLinkedHashmap(){
        Map<Integer, String> linkedHashmap = new LinkedHashMap<>();
        linkedHashmap.put(1, "A");
        linkedHashmap.put(21, "B");
        linkedHashmap.put(23, "C");
        linkedHashmap.put(141, "D");
        linkedHashmap.put(25, "E");

        linkedHashmap.forEach((Integer key, String val) -> System.out.println("Key: "+key+" Value: "+val));

        Map<Integer, String> normalMap = new HashMap<>();
        normalMap.put(1, "A");
        normalMap.put(21, "B");
        normalMap.put(23, "C");
        normalMap.put(141, "D");
        normalMap.put(25, "E");

        normalMap.forEach((Integer key, String val) -> System.out.println("Key: "+key+" Value: "+val));
    }
}
