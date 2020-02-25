package Java8;
interface sum{
    int sum(int a,int b);
}
public class Q2 {

    public static void main(String[] args) {
        sum sum=(a,b)->{return a+b;};
        System.out.println(sum.sum(13,24));
    }
}