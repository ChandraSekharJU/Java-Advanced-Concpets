package AccessSpecExample;

public class AccessSpecifiersExample {

    int i = 0;
    public void publicAccessSpec(){
        System.out.println("Can be accessed from any class or package");

        /// Can access the priavte method only in the same class
        privateAccessSpec();
    }

    private void privateAccessSpec(){
        System.out.println("Can be accessed only in the class");
    }

    protected void protectedAccessSpec(){
        System.out.println("Can be accessed in the same package only");
    }

    void defaultAccessSpec(){
        System.out.println("If no access specifier is mentioned, By Default it will be considered as default Access Specifier");
        System.out.println("default Access Specifier --> Can be accessed only through the classes of Same Package");
    }

    protected static void staticMethodEg(){
        System.out.println("Static method is implemented");
    }




}
