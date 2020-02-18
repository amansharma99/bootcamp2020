import java.util.Scanner;

public class Q3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.nextLine();
        System.out.println("Enter char:");
        String ch= sc.nextLine();
        if(ch.length()==1){
        int count = str.length() - str.replace(ch,"").length();
        System.out.println("Number of occurances of "+ch+" in "+str+" = "+count);
    }}
}
