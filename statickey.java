import java.util.*;
public class statickey{	
	public static void main(String[] args){
		Student.getD_name();
		Student s1 = new Student();
		s1.putInfo();
		s1.getInfo();
		s1.count_result();
		s1.getD_name();// call only in s1 to get d name and d name remain same for al obj because static
		Student s2 = new Student();
		s2.putInfo();
		s2.getInfo();
		s2.count_result();
		Student s3 = new Student();
		s3.putInfo();
		s3.getInfo();
		s3.count_result();
		Student s4 = new Student();
		s4.putInfo();
		s4.getInfo();
		s4.count_result();
		Student s5 = new Student();
		s5.putInfo();
		s5.getInfo();
		s5.count_result();
		Student.print_count_result();// no object because method is static 
		
	}
}
class Student{
	int roll_no;
	static int i=0;
	String name;
	int marks_sub1;
	int marks_sub2;
	int marks_sub3;
	static String d_name ;    // it is static because common for whole class
	String result;
	static int count_resultp=0;// how many students are pass or fail also common for whole class
	static int count_resultf=0;
	static void getD_name(){  // here we give d_name we will only call with obj1 but also print same result for obj2 also because fo all objects single copy of variable is created
		d_name = "IIPS";
		System.out.println("Department name "+ d_name);
	}
	void putInfo(){
		i++;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Informatin about student "+ i);
		System.out.println("enter roll no:");
		roll_no = sc.nextInt();
		System.out.println("enter name");
		name = sc.next();
		System.out.println("enter sub1 marks");
		marks_sub1 = sc.nextInt();
		System.out.println("enter sub2 marks");
		marks_sub2 = sc.nextInt();
		System.out.println("enter sub3 marks");
		marks_sub3 = sc.nextInt();
	}
	void count_result(){
		int total = marks_sub1 + marks_sub2 + marks_sub3	;
		double per = (total/300)*100;
		if(per>=33)
			result = "PASS";
		else
			result = "FAIL";
		if(result=="PASS")
			count_resultp++;
		else
			count_resultf++;
		
	}
	void getInfo(){
		
		System.out.println("Informatin about "+ name);
		
		System.out.println("roll no = "+ roll_no);
		System.out.println("sub1 marks = " + marks_sub1 );
		System.out.println("sub2 marks = " + marks_sub2 );
		System.out.println("sub3 marks = " + marks_sub3 );
	}
	static void print_count_result(){
		System.out.println("total pass" + count_resultp);
		System.out.println("total fail" + count_resultf);
	}
}