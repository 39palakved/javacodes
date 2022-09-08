/* method overloading */
import java.util.*;
import java.math.*;
public class assgn11{
	
		
	public static void main(String[] args){
		int r;
		double pie = 3.14;
		int a;
		System.out.println("Enter radius of circle");
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		
		
		System.out.println("Enter side of square");
		Scanner sd = new Scanner(System.in);
		a = sd.nextInt();
		M_over obj = new M_over();
		obj.area(pie,r);
		
		obj.area(a);
	
	}
}
class M_over{
	
		
		
	void area(double p, int rad){
		double Area1= p*rad*rad;
		System.out.println("Area of circle with radius " + rad + " is " + Area1);
	}
	void area(int a){
		int Area2 = a*a;
		System.out.println("Area of square with side " + a + " is " + Area2);
	}
}
