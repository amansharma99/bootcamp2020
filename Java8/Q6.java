package Java8;
interface Inter{
    static void display(){
        System.out.println("Static method");
    }
    default void print(){
        System.out.println("Default method");
    }
}
public class Q6 implements Inter{
    public static void main(String[] args) {
        Q6 obj=new Q6();
        Inter.display();
        obj.print();
    }
}