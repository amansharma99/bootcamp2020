package Java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q11 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4);
        System.out.println(list.stream().map(e->e*2).collect(Collectors.averagingDouble(e->e)));
    }
}