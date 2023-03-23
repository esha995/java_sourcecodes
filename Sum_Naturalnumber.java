
import java.util.Scanner;
public class Sum_Naturalnumber
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  of number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
		    int m=n+i;
		  	
		    System.out.println(n+"+"+i+"="+m);  
		}
	
	}
}