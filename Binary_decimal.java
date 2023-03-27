
import java.util.Scanner;
public class Binary_decimal {
    public void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int dec=0,i=1,rem;
        System.out.println("Enter the number1");
        int n= sc.nextInt();
        
         while(n!=0){
            rem=n%10;
            dec=dec+(rem*i);
            i=i*2;
            n=n/10;       
        }
        System.out.println("dec number"+dec);

    }
}