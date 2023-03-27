import java.util.Scanner;
public class Hcf_two {
    public void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int c=0;
        System.out.println("Enter the number1");
        int n1= sc.nextInt();
        System.out.println("Enter the number2");
        int n2= sc.nextInt();
        
         for(int i=1;i<=n1 || i<=n2;i++){
            if(n1%i==0 && n2%i==0)
            c=1;
        }
        System.out.println("hcf of given number"+c);

    }
}
