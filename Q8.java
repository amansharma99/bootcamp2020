import java.util.Scanner;
public class Q8 {
 public static void main(String[] args)
 {
     StringBuffer sbuffer = new StringBuffer();
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a string");
     sbuffer.append(input.nextLine());
     sbuffer.reverse();
     System.out.println(sbuffer);
     sbuffer.delete(4, 9);
     System.out.println(sbuffer);
 }
}
