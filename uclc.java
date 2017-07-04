package guvi;
import java.util.Scanner;
public class uclc {
	public static void main(String[] args) {
String s,b="";
char c;
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
for(int i=0;i<s.length();i++){
		  c = s.charAt(i);
		  if(c>=65 && c<=90){
		  b+=(char)(c+32);
		  }
		  else if(c>=97 && c<=122){
		  b+=(char)(c-32);
		  }
		  
		 }
System.out.println("original String:"+s);
System.out.println("uprlwrcase String:"+b);
	}
}


