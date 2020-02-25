package Java8;
interface Interface1{
    default void show(){
        System.out.println("Interface1");
    }
}
interface Interface2{
    default void show(){
        System.out.println("Interface2");
    }
}
public class Q8 implements Interface1, Interface2{
    @Override
    public void show(){
        Interface1.super.show();
        Interface2.super.show();
    }

    public static void main(String[] args) {
        Q8 obj=new Q8();
        obj.show();
    }
}