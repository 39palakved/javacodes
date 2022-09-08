/* selection sort */
import java.util.*;
public class assgn20{
	public static void main(String[] args){
		Ssort s = new Ssort();
		s.sortfunc();
		
	}
}
class Ssort{
	void sortfunc(){
		int [] arr= {2,8,1,9,3,7};
		int j;
		int i;
		int temp;
		int n=6;
		for(i=0; i<n-1;i++){
			for(j=i+1; j<n;j++){
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(i=0; i<n;i++){
			System.out.println(arr[i]);
		}
	}
}