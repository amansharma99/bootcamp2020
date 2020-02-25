package Java8;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
interface consumer{
    void consumerMethod();
}
public class Q5 {
    public static void main(String[] args) {
        //Consumer
        Consumer consumer=(e)->{
            System.out.println("Welcome to "+e);
        };
        consumer.accept("TTN");
        //Supplier
        Supplier supplier=()->{
            return "Content of Supplier";
        };
        System.out.println(supplier.get());
        //Predicate
        Predicate<Integer> predicate=(e)->{
            return e%2==0;
        };
        System.out.println(predicate.test(28));
        //Function
        Function<Integer, Integer> function=(e)-> e/=5;
        function=function.andThen(e->e*2);
        System.out.println(function.apply(25));

    }
}