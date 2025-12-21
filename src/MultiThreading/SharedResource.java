package MultiThreading;

public class SharedResource {
    boolean itemAvailable = false;
    void addItem(){
       itemAvailable = true;
        System.out.println("Item Added");
    }

    void consumeItem(){
        itemAvailable = false;
        System.out.println("Item Consumed");
    }
}
