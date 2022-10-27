package firstproject;
import java.util.*;
public class checkpassword {
	public static void main(String[] args) {
		String pass1,pass2;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Your Password");
	    pass1=sc.next();
	    System.out.println("Re-enter Your Password");
	    pass2=sc.next();
	   sc.close();
	    if(pass1.equals(pass2)) {
		System.out.println("Password is Matched");
	}else
	{
		System.out.println("Password is Incorrect");
	}
	}

}
