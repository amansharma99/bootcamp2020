package Java8;
import java.util.*;
class NIET
{
    public static void main(String[] args) {
        List<String> studentlist=  Arrays.asList("Ram","Sham","Aman","Sharma");
        studentlist.sort(String::compareTo);
        studentlist.forEach(System.out::println);
    };
    }
