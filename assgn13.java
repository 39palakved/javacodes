/* for each loop */
/* we can't modify array using for each loop*/
import java.util.*;
public class assgn13{
	public static void main(String[] args){
		Loop l = new Loop();
		l.func2();
		
	}
}
class Loop{
	void func2(){
		
		int[] marks = {3,7,20,17,24};
		
		System.out.println("your marks are :");
		for(int num : marks){
			System.out.println(num);
		}
	}
}