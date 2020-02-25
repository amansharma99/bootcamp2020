package Java8;
interface Interface{
    void function(int a, int b);
}
public class Q3 {
    static void sum(int a, int b){
        System.out.println(a+b);
    }
    static void subtract(int a, int b){
        if(a>b)
            System.out.println(a-b);
        else
            System.out.println(b-a);
    }
    void multiply(int a, int b){
        System.out.println(b*a);
    }

    public static void main(String[] args) {
        Interface i=Q3::sum;
        Interface i1=Q3::subtract;
        Interface i2=new Q3()::multiply;
        i.function(20,20);
        i1.function(10,50);
        i2.function(9,8);
    }
}