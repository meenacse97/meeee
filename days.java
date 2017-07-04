package guvi;
import java.util.Scanner;
public class days {
	public static void main(String[] args) {
		String s;
		System.out.println("enter the string");
		Scanner b=new Scanner(System.in);
		s=b.nextLine();
		switch(s){
		case "monday":
			System.out.println("true");
			break;
		case "tuesday":
			System.out.println("true");
			break;
		case "wednesday":
			System.out.println("true");
			break;
		case "thursday":
			System.out.println("true");
			break;
		case "friday":
			System.out.println("true");
			break;
		case "saturday":
			System.out.println("true");
			break;
		case "sunday":
			System.out.println("false");
			break;
			default:
				System.out.println("null");
		}
		}

}
