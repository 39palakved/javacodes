import java.util.Scanner;
import java.lang.*;
import java.math.*;
public class onedarray{
	public static void main(String args[]){
		int choice;
		int arr[] ={1,3,9,6,2,5};
		int i=0;
		int j=1;
		int max =0;
		int min ;
		int temp=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("please choose 1 for max element");
			System.out.println("please choose 2 for min element");
			
			System.out.println("please choose 3 for second largest");
			System.out.println("please choose 4 for exit");
			System.out.println("please enter your choice");
			choice = sc.nextInt();
			switch(choice){
				case 1 : for(i=0 ; i<6 ; i++){
						
						if(arr[i]>max){
							max = arr[i];
						}
					}
						
					System.out.println("max element is " + max);
					break;
				case 2 : 	min = max;
						for(i=0; i<6 ; i++){
						
						if(arr[i]<min){
							min = arr[i];
						}
						
					
					}
					System.out.println("max element is " + min);
					break;
				case 3 : 	
				case 4 : 
					System.exit(0);
					
				default: 
					System.out.println("you entered a wrong case please enter again ");
			}
		}
	}
}