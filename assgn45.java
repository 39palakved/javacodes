/* palindrome or not */
import java.util.*;
public class assgn45{
	
	public static void main(String [] args){
		Palin obj = new Palin();
	
		obj.func();
	
		
	}
	
}	
class Palin{
	int num;
	int count =0;
	void func(){
		
		int i;
		int rem;
		int rev =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any five digit number");
		num = sc.nextInt();
		int num2 = num;
		
		int count1 = count_digit();
		
		num = num2;
		
		
		if(count1==5){
			while(num!=0){
			rem  = num%10;
			rev = rev*10 + rem;	
			num = num/10;
			}
		}
		else{
			
			System.out.println("Your number does not contain 5 digit please enter number again");
			Scanner sd = new Scanner(System.in);
			num = sd.nextInt(); 
			
			
			
		}
		if(rev == num2){
			System.out.println("PALINDROM");
		}
		else{
			System.out.println("NOT PALINDROM");	
		}
	}
	
	
	
		
	
	int count_digit(){
		while(num!=0){
			count++;
			num = num/10;
		
		}
		return  count;
	}
}