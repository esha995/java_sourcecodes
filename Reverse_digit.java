
import java.util.Scanner;
public class Reverse_digit {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in); 
         System.out.println("Enter the reverse number");
            int n = sc.nextInt();
            int rev=0;
            int sum=0;
            while(n!=0){
                int rev=n%10;
                rev=rev*10+rev;
                n=n/10;
                sum= sum+n;
            }
           
                System.out.println(n);
                System.out.println(sum);
            
        
    }
    
}