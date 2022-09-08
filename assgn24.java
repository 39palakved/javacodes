/* Anonymous array -> without any name.... for one time requirement  */
public class assgn24{
	public static void main(String[] args){
		 sum(new int [] {2,4,5,7,8});
	}
	public static void sum(int[] a){
		int total =0;
		for(int temp : a)
			total = total +temp;
			System.out.println("sum of all array elements is = " + total);
	}
}	
			