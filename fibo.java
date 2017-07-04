package guvi;
import java.util.Scanner;
public class fibo {
	 public static void main(String[] args) {

	        int n,a1=0,a2=1;
	        Scanner s=new Scanner(System.in);
	        System.out.print("Enter the number:");
            n=s.nextInt();
	        for (int i = 1; i <= n; ++i)
	        {
	            System.out.print(a1+ " ");

	            int sum = a1+a2;
	            a1=a2;
	            a2=sum;
	        }
	    }
	}


