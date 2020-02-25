package Java8;
import java.util.Arrays;
import java.util.List;
public class Q12 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4);
        System.out.println(list.stream().filter(e->e>3).filter(e->e%2==0).findFirst().orElse(-1));
    }

}