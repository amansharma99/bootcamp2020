package Java8;
interface override{
    default void overriding(){
        System.out.println("Hello, Welcome to Terminal");
    }
}
public class Q7 implements override{
    @Override
    public void overriding(){
        System.out.println("Hello, Welcome to TTN");
    }
    public static void main(String[] args) {
        Q7 obj=new Q7();
        obj.overriding();


    }

}
