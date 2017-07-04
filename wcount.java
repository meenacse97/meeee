package LogicProgram;
import java.util.Scanner;
public class wcount {
public static void main(String[] args){
	String s;
	char ch;
	int count=0;
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	for(char i='a';i<='z';i++){
		count=0;
		for(int j=0;j<s.length();j++){
			ch=s.charAt(j);
			if(ch==i){
				count++;
			}
		}
if(count!=0){
	System.out.println(i+ "\t" +count);
}
	}
}
}
