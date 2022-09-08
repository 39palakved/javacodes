/* product of odd integer from 1 to 15 */
import java.util.*;
public class assgn6{
	public static void main(String[] args){
		Oddint o = new Oddint();
		o.odd();
	}
}
class Oddint{
	void odd(){
		int i;
		int ans = 1;
		for (i=1; i<=15; i++){
			
			if(i%2!=0){

				ans = ans*i;
			}
		}
		System.out.println("Product of odd integers from 1 to 15 is " + ans);
		}
}


		
		