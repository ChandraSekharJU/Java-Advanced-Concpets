package InterfaceExample;

public interface FnInterfaceExWithoutAnnotation {
    //A Functional Interface is an Interface which contains only a single Abstract Method
    void singleMethod();

    default void normalMethod1(){

    };

    static void normalMethod2(){

    }

}
