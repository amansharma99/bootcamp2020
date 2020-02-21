import java.util.ArrayList;
import java.util.Scanner;

public class Q1
{
    public static void main(String[] args)
    {
        float a=0.0f;
        ArrayList<Float> list1=new ArrayList<Float>();
        System.out.println("Enter 5 Elements: ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
         list1.add(sc.nextFloat());
        }
        System.out.println("Entered values are:");
        for(int i=0;i<list1.size();i++)
        {
            System.out.println(+list1.get(i));
        }
        for(int i=0;i<list1.size();i++)
        {
            a=a+list1.get(i);
        }
        System.out.println("Sum is :"+a);
    }
}