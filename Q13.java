import java.util.Scanner;
class CustomException extends Exception{
    CustomException(String msg){
        super(msg,null,true,false);
    }
}
public class Q13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value greater than 1000:");
        int num = sc.nextInt();
        try{
            if(num < 1000){
                throw new CustomException("Exception entered number is less than 1000");
            }
        }
        catch(CustomException e){
            e.printStackTrace();
        }
    }
}
