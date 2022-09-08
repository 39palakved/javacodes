/* average of 5 integers */
import java.util.*;
public class assgn4{
	public static void main(String[] args){
		Average a = new Average();
		a.avg();
}
}
class Average{
	void avg(){
		int a,b,c,d,e;
		int ans;

		System.out.println("Please enter 5 intigers");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		Scanner sd = new Scanner(System.in);
		b = sd.nextInt();
		Scanner se = new Scanner(System.in);
		c = se.nextInt();
		Scanner sf = new Scanner(System.in);
		d = sf.nextInt();
		Scanner sg = new Scanner(System.in);
		e = sg.nextInt();
		ans = (a+b+c+d+e)/5;
		System.out.println("average of 5 integers is = " + ans);
	}
}

