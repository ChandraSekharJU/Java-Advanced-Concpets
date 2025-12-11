package InterfaceExample;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TypesOfFnInterface {
    /**
     * Functional Interface has 4 types:
     * 1) Consumer     *  accepts a single parameter & returns null
     * 2) Supplier      *  accepts no parameter input but returns a value
     * 3) function
     * 4) Predicate
     */

    public Consumer<Integer> consumerExample = (Integer i) -> {
        if(i > 30000){
            System.out.println("Salary is more than 30000");
        } else {
            System.out.println("Salary is less");
        }
    };

    public Supplier<String> stringSupplier = () -> {return "This is example for Supplier Type Functional Interface";};

    public Function<Integer, String> functionTypeExample = (Integer i) -> {
        if(i > 30000) return "Salary is okay for Bachelor";
        else return "Salary is low";
    };

    public Predicate<Integer> integerPredicate = (Integer i) -> {
        return i % 2 == 0;
    };
}
