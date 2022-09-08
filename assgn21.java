/* Bubble sort */
import java.util.*;
public class assgn21{
	public static void main(String[] args){
		Bsort b = new Bsort();
		b.bsortfunc();
		
	}
}
class Bsort{
	void bsortfunc(){
		int [] arr= {2,8,1,9,3,7};
		int j;
		int i;
		int temp;
		int n=6;
		for(i=0; i<n-1;i++){
			for(j=0; j<n-1-i;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(i=0; i<n;i++){
			System.out.println(arr[i]);
		}
	}
}