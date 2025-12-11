package InterfaceExample;
@FunctionalInterface
public interface FnInterfaceExWithAnnotation {
    void singleMethod();

    default void egDefaultMethod(){
        System.out.println("In Functional Interface, we can have the default method");
    }
    default void egDefaultMethod1(){
        System.out.println("In Functional Interface, we can have number of default method");
    }
    static void egStaticMethod(){
        System.out.println("In Functional Interface, we can have the static method also but it can be accessible only in interface");
    }
}
