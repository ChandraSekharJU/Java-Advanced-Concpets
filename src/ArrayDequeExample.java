import java.util.*;

public class ArrayDequeExample {
    protected void createArrayDeque(){
        System.out.println("createArrayDeque --->");
        ArrayDeque<Integer> integerArrayDeque = new ArrayDeque<>();

        /**
         * Using as Queue(FIFO)
         */

        //Insertion
        integerArrayDeque.addLast(5);
        integerArrayDeque.addLast(10);
        integerArrayDeque.addLast(1);
        integerArrayDeque.forEach((Integer val) -> System.out.println("addedDequeValues as Queue(FIFO): " + val));

        //Deletion
        int element = integerArrayDeque.removeFirst();
        System.out.println("removed element in terms of FIFO "+element);

        /**
         * Implementing as Stack(LIFO)
         */

        ArrayDeque<Integer> integerArrayDequeAsStack = new ArrayDeque<>();
        integerArrayDequeAsStack.addFirst(4);
        integerArrayDequeAsStack.addFirst(3);
        integerArrayDequeAsStack.addFirst(2);
        integerArrayDequeAsStack.addFirst(1);

        integerArrayDequeAsStack.forEach((Integer val) -> System.out.println("Values printed in Stack: " + val));

    }

    public List<Integer> frequencyCount(int[] arr){
        /*//create the hash array
        List<Integer> hashArray = new ArrayList<>(arr.length);
        Integer[] hashArr = new Integer[arr.length];
        for(int i = 0; i < arr.length; i++){
        //Pre-Compute
            hashArr[i] +=1;
        System.out.println(hashArr[i]);
    }
        hashArray = Arrays.asList(hashArr);
        return hashArray;*/
       /* int n = arr.length;
        List<Integer> hashArr = new ArrayList<>(Collections.nCopies(n,0));
        for(int i = 0; i < n; i++){
            hashArr.set(i, hashArr.get(i)+1);
            System.out.println(hashArr);
        }
        return hashArr;*/
       int n = arr.length;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }
        List<Integer> freqList = new ArrayList<>();
        for(int num: arr){
            freqList.add(freqMap.get(num));
        }
        return freqList;
    }

}
