import java.util.Scanner;

/*public class Q8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str="";
        System.out.println("Enter String");
        while(!(str=sc.next()).equals("done"))
        {
            if(str.charAt(0)==str.charAt(str.length()-1))
            {
                System.out.println("First and Last char of "+str+" is equal");
            }
            else
                {
                    System.out.println("First and Last char of "+str+" is not equal");
            }
        }
    }
}*/



public class Q8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str="";
        System.out.println("Enter String");
        str=sc.next();
        do
        {
            if(str.charAt(0)==str.charAt(str.length()-1))
            {
                System.out.println("First and Last char of "+str+" is equal");
            }
            else
            {
                System.out.println("First and Last char of "+str+" is not equal");
            }
        }
        while(!(str=sc.next()).equals("done"));

    }
}
