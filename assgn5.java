/* if a is multiple of b or not */
import java.util.*;
public class assgn5{
	public static void main(String[] args){
		Multiple m = new Multiple();
		m.mul();
	}
}
class Multiple{
	void mul(){
		int a,b;
		

		System.out.println("Please enter 2 intigers");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		Scanner sd = new Scanner(System.in);
		b = sd.nextInt();
		if(a%b==0)
			System.out.println("Yes " + a + " is multiple of " + b);
		else
			System.out.println("NO " + a + " is not the multiple of " + b);
	}
}
