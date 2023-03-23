import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class Leap_year {
    public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter the year");
       int n1 = sc.nextInt();
       boolean flag=false;

       if(n1%400==0)
          flag=true;
        else if(n1%100==0)
           flag=false;
        else if(year%4==0)
           flag=true;
        else
           flag=false;
        if(flag)
        System.out.println("year"+n1+"is a leap year");
        else
        System.out.println("year"+n1+"is not a leap year");

}
}