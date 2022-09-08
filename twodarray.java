/* 2D array */
import java.util.*;
public class twodarray{
	public static void main(String [] args){
		int [][]arr1 = new int[3][3];
		int [][]arr2 = new int[3][3];
		int choice;
		Scanner sc = new Scanner(System.in);
		Scanner sd = new Scanner(System.in);
		System.out.println("enter a 2 D array of 3x3");	
		int i,j;
		for(i=0; i<3; i++){
			for(j=0; j<3; j++){
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println(" 1st matrix is");
		for(i=0; i<3; i++){
			for(j=0; j<3; j++){
				System.out.print(arr1[i][j] + " ");
				
			}
			System.out.println();
		}
		System.out.println(" again enter a 2 D array of 3x3");	
		for(i=0; i<3; i++){
			for(j=0; j<3; j++){
				arr2[i][j] = sd.nextInt();
			}
		}
		System.out.println(" 2nd matrix is");
		for(i=0; i<3; i++){
			for(j=0; j<3; j++){
				System.out.print(arr2[i][j] + " ");
				
			}
			System.out.println();
		}
		int sum =0;
		int max =0;
		
		Scanner se = new Scanner(System.in);
		System.out.println("Choose 1 for sum of all values of arr1");
		System.out.println("Choose 2 to find max of all values of arr1");
		
		System.out.println("Choose 3 to add both the arrays ");
		System.out.println("Choose 4 to check both the arrays for equal");
		System.out.println("Choose 5 for transpose of arr1");
		System.out.println("Choose 6 for exit");
		while(true){
			System.out.println("enter your choice");
			choice = se.nextInt();
			int arr3[][] = new int[3][3];
		
			switch(choice){
			
				case 1: 
					System.out.println("sum of all values of arr1");
					for(i=0; i<3; i++){
						for(j=0; j<3; j++){
							sum = sum + arr1[i][j]; 
						}
				
					}
					System.out.println(sum);
					break;
				
				
				case 3:
					System.out.println("Sum of arr1 and arr2 is");
					for(i=0; i<3; i++){
						for(j=0; j<3; j++){
						arr3[i][j] = arr1[i][j] + arr2[i][j];
						}
					}
					for(i=0; i<3; i++){
						for(j=0; j<3; j++){
						System.out.print(arr3[i][j] + " ");
						}
						System.out.println();
					}
					break;	
				case 4: 
					int flag=0;
					System.out.println("two arrays are equal or not");
					for(i=0; i<3; i++){
						flag=0;
						for(j=0; j<3; j++){
							if(arr1[i][j] == arr2[i][j]){
								flag++;	
						 	}
						}
						
					}
					if(flag == 3){
						System.out.println("Yes, Both the arrays are equal");
					}
					else{
						System.out.println("No, Both the arrays are not equal");
					}

					break;	
				case 5:
					System.out.println("Transpose of arr1");
					int arr4[][] = new int[3][3];
					int k=0;
					for(i=0; i<3; i++){
						for(j=0; j<3; j++){
						arr4[i][j] = arr1[j][i]	;
						}
				
					}
					for(i=0; i<3; i++){
						for(j=0; j<3; j++){
							System.out.print(arr4[i][j] + " ");
				
						}
						System.out.println();
					}
					break;
				case 6:
				
					System.exit(0);
				default:
					System.out.print("you enter a wrong choice please enter again");
			}
		}

	}
}	