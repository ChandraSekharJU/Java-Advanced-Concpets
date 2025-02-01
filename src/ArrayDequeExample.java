import java.util.ArrayDeque;

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
}
