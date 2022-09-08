/* uppercase and lowercase */
import java.util.*;
public class assgn36{
	public static void main(String[]args){
		String s1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string");
		s1 = sc.next();
		System.out.println("String is " + s1);
		// coverting string into uppercase
		String s2=s1.toUpperCase();
		System.out.println("Uppercase String is " + s2);
		String s3=s1.toLowerCase();
		System.out.println("lowercase String is " + s3);
	}
}