/* string concatinate */
public class assgn32{
	public static void main(String [] args){
		Stringc s = new Stringc();
		s.concatinate();
	}
}
class Stringc{
	void concatinate(){
		String s1 = "Palak ";
		String s2 = "ajay gwala";
		String s3 = s1.concat(s2);
		System.out.println(s3);
	}
}