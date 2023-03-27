import java.util.Scanner;
public class Prime_number {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        
        int i, c=0;
        for(i=2, i<n;i++)
        {
            if(n%i==0)
            c++;
            break;
        }
        if(c==0)
        {
            System.out.println(n+"is prime");
        }
        else{
            System.out.println(n+"not prime");
        }

    }
}
