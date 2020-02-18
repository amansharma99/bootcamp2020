import java.text.*;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args)
    {
        int uppercase=0;
        int lowercase=0;
        int specialchar=0;
        int digits=0;
        System.out.println("Enter String:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int totalchar=str.length();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(Character.isUpperCase(c))
                uppercase++;
            else if(Character.isLowerCase(c))
                lowercase++;
            else if(Character.isDigit(c))
                digits++;
            else
                specialchar++;
        }
        double upper=(uppercase*100.00)/totalchar;
        double lower=(lowercase*100.00)/totalchar;
        double digit=(digits*100.00)/totalchar;
        double special=(specialchar*100.00)/totalchar;
        System.out.println("Numbers of uppercase are: "+uppercase+"Percentage of lowercase are: "+upper);
        System.out.println("Numbers of lowercase are: "+lowercase+"Percentage of lowercase are: "+lower);
        System.out.println("Numbers of digits are: "+digits+"Percentage of digits are: "+digit);
        System.out.println("Numbers of specialcharacter are: "+specialchar+"Percentage of special character are: "+special);
    }
}
