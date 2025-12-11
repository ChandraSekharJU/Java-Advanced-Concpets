package InterfaceExample;

public interface Java8FeaturesInterfaceEg {
    //By Default the methods declared in the interface are abstract
    void byDefaultAbstract();

    //Java 8  has introduced a new feature for interface
    default void defaultMethodEg(){
        // This feature has been introduced to avoid the repetetive implementations of methods
        System.out.println("We can declare default method in the Interface");
        staticMethodEg();
    }

    static void staticMethodEg(){
        System.out.println("We can declare static method in the interface");
    }
}
