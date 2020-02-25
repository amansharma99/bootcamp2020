package Java8;
import java.util.Arrays;
import java.util.List;
public class Q9 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,3,4,5,6,7,8,9);
        list.stream().filter(e->e%2==0).forEach(System.out::println);
    }

}