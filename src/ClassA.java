import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class ClassA {
    void display() {
        List<Integer> list = new ArrayList<>(List.of());
        int[] arrInt = {1, 2,};
        List<Integer> filtered = list.stream().filter(integer -> integer > 1).collect(Collectors.toList());
    }
}