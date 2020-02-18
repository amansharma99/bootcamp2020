import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.nextLine();
        String[] words = str.split(" ");
        int count=0;
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j]="0";
                }
            }
            //Displays the duplicate word if count is greater than 1
            if (count >1  && words[i]!="0")
            {
                System.out.println("Answer:");
                System.out.println(words[i]);
            }
        }
    }
}
