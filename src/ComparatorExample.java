import java.util.Arrays;

/**
 * Small Comparator & Comparable Example
 */
public class ComparatorExample {
    /**
     * Passing comparator to sort method for a sample array
     */
    private void compareUsingComparator(){
        /**
         * (Integer value1, Integer value2) -> value1-value2 for Ascending order
         * (Integer value1, Integer value2) -> value2-value1 for Descending order
         */
        Integer[] arr = {3,2,5,6,1};
        Arrays.sort(arr, (Integer value1, Integer value2) -> value1-value2);
    }

    /**
     *Passing nothing to sort method for a sample array
     * Interlly goes to compareTo method which is part of Comparable
     */
    private void compareWithoutComparator(){
        Integer[] arr = {1,2,3,4,5,8,6};
        Arrays.sort(arr);
    }
}
