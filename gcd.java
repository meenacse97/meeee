package guvi;
import java.util.Scanner;
public class gcd {
	 public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in); 
	        int n1=sc.nextInt();
	        int n2=sc.nextInt();
	        int r=0;
	        while(n2 != 0)
	            {
	                r = n1 % n2;
	                n1 = n2;
	                n2 = r;
	            }
	        System.out.print("GCD = "+n1);
	    }
}
