public class Callingmain{
	public static void main(String args[]){
		String arr[] = {"Indore","Garoth","Future"};
		array.main(arr);
	}
}
class array{
	public static void main(String[] args){
		for(String temp: args){
			System.out.println(temp);
		}
	}
}
// because main is a static method so accesible without object 	