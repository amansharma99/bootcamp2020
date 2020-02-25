package Java8;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Bi {
    public static void main(String[] args) {
        BiFunction<Integer,Long,Integer> bi=(e1,e2)->{
            return Math.toIntExact(e1 + e2);
        };
        System.out.println(bi.apply(10,30L));
        Predicate<Integer> predicate=(e)->e%2==0;
        System.out.println(predicate.test(11));
        Predicate<String> predicate1=(e)->e.startsWith("no");
        System.out.println(predicate1.test("nope"));
    }
}
 