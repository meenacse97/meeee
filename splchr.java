package guvi;
import java.util.Scanner;
public class splchr {
	public static void main(String[] args){

        int n, m, a =0,x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = s.nextInt();
        m = n;
        while(n > 0)
        {
            x = n % 10;
            a = a * 10 + x;
            n = n / 10;
        }
       if(m==a){
    	   System.out.println("n is a palindrome");
       }
       else
    	   System.out.println("n is not a palindrome"); 
    }
}

