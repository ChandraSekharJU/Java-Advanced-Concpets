package InterfaceExample;

public class FnImplExample implements FnInterfaceExWithAnnotation {
    @Override
    public void singleMethod() {
        System.out.println("Functional Interface Implementation Example");
    }

    /**
     * LambdaExpression is a way to implement the Functional Interface
     * Generally there are 3 ways to implement the Functional Interface
     * 1) Using the implements keyword
     *  2) Using the Anonymous class
     *  3) Using the Lambda expression which is similar to Anonymous class but reduces the Verbose
     */



}
