import java.util.Scanner;
public class MaximumtwoNumber {

public static void main(String args[]){
    int n1 , n2;
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter the first Number");
        n1 = sc.nextInt();
    System.out.println("Enter the second Number");
        n2 = sc.nextInt();
       if(n1>n2)
       {
           System.out.println(n1+"n2 is greater");

       }
       else{
           System.out.println(n2+"n1 is greater");
       }
   
}
}


 