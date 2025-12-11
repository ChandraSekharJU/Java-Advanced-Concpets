package InterfaceExample;

public class LambdaExpressionExample {
    FnInterfaceExWithAnnotation lamdaExpressionExample = () -> {
        System.out.println("This is the lambda expression");
        System.out.println("This is a way to implement the functional interface");
    };
    public void lamdbaImpl1(){
        lamdaExpressionExample.singleMethod();
    }
}
