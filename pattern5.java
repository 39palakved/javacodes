/* pattern left align */
import java.util.*;
public class pattern5{
	public static void main(String[] args){
		int i;
		int j;
		int num;
		int k;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		
		num = sc. nextInt();
			
		for(i=1; i<=num;i++){
			for(j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
			
		}
	}
}