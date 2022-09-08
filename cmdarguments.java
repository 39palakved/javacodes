import java.lang.Number.*;
public class cmdarguments{
	public static void main(String[] args){
		
		//int a = Integer.parseInt("4");
		int l = Integer.parseInt(args[0]);
  		int b =  Integer.parseInt(args[1]);
		System.out.println("area of square =" + l*b);
 	}
}