import java.util.Scanner;

public class Q5 {
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        int n,m;
        System.out.print("Enter no. of elements you want in first array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter no. of elements you want in second array:");
        m = s.nextInt();
        int b[] = new int[m];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < m; i++)
        {
            b[i] = s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.println(" "+a[i]+" ");
                    a[i]=0;
                    b[j]=0;
                }
            }
        }
    }
}
