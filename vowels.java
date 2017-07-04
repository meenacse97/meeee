package LogicProgram;
import java.util.Scanner;
public class vowels {
	public static void main(String[] args){
		String a,b="";
		Scanner s=new Scanner(System.in);
		a=s.nextLine();
		for(int i=a.length()-1;i>=0;i--){
			b=b+a.charAt(i);
		}
		System.out.println(b);
		String c=a.replaceAll("[aeiou]", "");
		System.out.println(c);
		//if(a.equals(b)){
			//System.out.println(a+  "No vowels present");
		}
			
	}


