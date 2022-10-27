package firstproject;
import java.util.Scanner;
public class oenumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		System.out.println("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		String check = (a%2==0)?"Even":"Odd";
		sc.close();
		System.out.println("the given number:  "+a+" "+check);

	}



}
