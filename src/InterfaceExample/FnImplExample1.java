package InterfaceExample;

public class FnImplExample1 {
    FnInterfaceExWithAnnotation fnInterfaceExWithAnnotation = new FnInterfaceExWithAnnotation() {

            @Override
            public void singleMethod() {
                System.out.println("Functional Interface Implementation using the Anonymous class");
            }
        };
}
