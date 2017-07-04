package LogicProgram;
import java.util.Scanner;
public class word {
	public static void main(String args[]){
		    String s;
	        Scanner sc= new Scanner(System.in);
	        System.out.print("Enter a Line : ");
	        s= sc.nextLine();
			int count = 1;
        for(int i=0; i<=s.length()-1; i++)
        {
            if(s.charAt(i)== ' ' && s.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        System.out.print("Total Number of Words in Entered Sentence is " +count);
    }  
}
