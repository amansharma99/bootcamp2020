package Java8;
interface Greater{
    boolean method(int a, int b);
}
interface increment{
    int method(int a);
}
interface concat{
    String method(String a,String b);
}
interface upper{
    String method(String a);
}
public class Q1 {
    public static void main(String[] args) {
        Greater g=(a,b)->{
            if(a>b) return true;
            else return false;
        };
        increment i=a -> {return ++a;};
        concat c=(a,b)-> {return a.concat(b);};
        upper u=(a) -> {return a.toUpperCase();};
        boolean b=g.method(12,25);
        int var=i.method(50);
        String s=c.method("Hello", "World");
        String s1=u.method("aman sharma");
        System.out.println(b);
        System.out.println(var);
        System.out.println(s);
        System.out.println(s1);
    }
}