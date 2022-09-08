/* enumerated datatpes -> non premetive datatype */
public class assgn29{
	public static void main(String[] args){
		Enum e = new Enum();
		e.enumfunc();
	}
}
class Enum{
	void enumfunc(){
		enum days{ Sunday=1, 
			   Monday,
			   Tuesady,
			   Wednesday,
			   Thursday,
			   Friday,
			   Saturday};
		for(i=Sunday; i<=Saturday; i++){
			System.out.println(i);
		}
	}
}