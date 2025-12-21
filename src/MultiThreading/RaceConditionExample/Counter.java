package MultiThreading.RaceConditionExample;

public class Counter {
    int count = 0;
    void increment(){
//        System.out.println("Current count: " + count);
        count++;
    }
}
