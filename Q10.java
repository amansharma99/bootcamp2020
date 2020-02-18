import java.util.Scanner;

public class Q10 {
    public static int overload(int x,int y)
    {
        System.out.println(x+y);
        return x+y;
    }
    public static double overload(double x,double y)
    {
        System.out.println(x+y);
       return x+y;
    }
    public static float overload(float x,float y)
    {
        System.out.println(x*y);
        return x*y;
    }
    public static void overload()
    {
        int x,y;
        Scanner s2=new Scanner(System.in);
        System.out.println("Enter elements:");
        x=s2.nextInt();
        y=s2.nextInt();
        System.out.println(x*y);
    }
    public static String overload(String a,String b)
    {
        System.out.println(a+b);
        return a+b;
    }
    public static String overload(String a,String b,String c)
    {
        System.out.println(a+b+c);
        return a+b+c;
    }
    public static void main(String[] agrs) {
        int ch = 0;
        String s[];
        System.out.println("1.Adding Two Integers");
        System.out.println("2.Adding Two Doubles");
        System.out.println("3.Multiplying Two Floats");
        System.out.println("4.Multiply two int");
        System.out.println("5.Concate 2 Strings");
        System.out.println("6.Concate 3 strings");
        System.out.println("Enter your Choice");
        Scanner sc=new Scanner(System.in);
        ch=sc.nextInt();
        switch (ch) {
            case 1:
                int x = 0, y = 0,z=0;
                System.out.println("Enter Two Values");
                Scanner s1 = new Scanner(System.in);
                x = s1.nextInt();
                y = s1.nextInt();
                overload(x,y);
                break;
            case 2:
                double a = 0, b = 0;
                System.out.println("Enter Two Values");
                Scanner s2 = new Scanner(System.in);
                a = s2.nextDouble();
                b = s2.nextDouble();
                overload(a,b);
                break;
            case 3:
                float c,d;
                System.out.println("Enter Two Values");
                Scanner s3 = new Scanner(System.in);
                c = s3.nextFloat();
                d = s3.nextFloat();
                overload(c,d);
                break;
            case 4:
                overload();
                break;
            case 5:
                String S1,S2;
                Scanner s4=new Scanner(System.in);
                System.out.println("Enter Two String");
                S1=s4.nextLine();
                S2=s4.nextLine();
                overload(S1,S2);
                break;
            case 6:
                String S3,S4,S5;
                Scanner s5=new Scanner(System.in);
                System.out.println("Enter Three String");
                S3=s5.nextLine();
                S4=s5.nextLine();
                S5=s5.nextLine();
                overload(S3,S4,S5);
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}