package guvi;
import java.util.Scanner;
public class numstr {
	public static void main(String[] args){
	String s;
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	int count = 0;
	for (int i = 0, len = s.length(); i < len; i++) {
	    if (Character.isDigit(s.charAt(i))) {
	        count++;
	    }
	}
	System.out.println(count);
	}
}
