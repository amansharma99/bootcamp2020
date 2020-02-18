import java.util.Scanner;
public class Q7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name");
        String first=sc.nextLine();
        System.out.println("Enter your last name");
        String last =sc.nextLine();
        staticDemo sd = new staticDemo();
        sd.showname(first,last);
    }
}
class staticDemo{
    static int age;  //Static Member
    static String firstname="";
    static  String lastname="";

    static{    ///Static Block
        age =21;

    }
    static void showname(String first,String last){   ///Static Method
        firstname=first;
        lastname=last;
        System.out.println("Your first name is "+firstname);
        System.out.println("Your Last name"+lastname);
        System.out.println("Your age is "+age);

    }
}