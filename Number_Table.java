
import java.util.Scanner;
public class Number_Table
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  of tables");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++){
		int m=n*i;
		  System.out.println(n+"*"+i+"="+m);  
		}
	
	}
}