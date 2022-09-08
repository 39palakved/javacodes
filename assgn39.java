
/*Employee capabilities class */
import java.util.*;
public class assgn39/*Employee's capabilities*/{
	public static void main(String[] args){
		double salary;
		Employee_capabilities emp1 = new Employee_capabilities();
		Employee_capabilities emp2 = new Employee_capabilities();
		System.out.println("first employee's salary");
		emp1.yearly_salary(1.500000);
		System.out.println("second employee's salary");
		
		emp2.yearly_salary(1.600000);
	}
}
class Employee_capabilities{
	void yearly_salary(double sal){
		System.out.println(sal);
	}
}

