/* stack class */
import java.util.*;
public class assgn23{
	public static void main(String[] args){
		stack obj = new stack();
		
		obj.pop();
		obj.push(2);
		obj.push(4);
		obj.push(6);
		obj.push(7);
		obj.push(10);
		obj.printstack();

	}
	
}
class stack{
	int top=-1;
	int max=5;
		
		
	int[]stack1 = new int[max];									
	boolean isempty(){
		if(top==-1){
			
			return true;
		}
		else
			return false;
	}
	boolean isfull(){
		if(top==max)
			return true;
		else 
			return false;
	}
	void pop(){
		if(isempty())
			System.out.println("stack is empty you can't pop elements");
		else
			top--;	
	}
	void push(int num){
		if(isfull())
			System.out.println("stack is empty you can't insert elements");	
		else
			
			top++;
			stack1[top] = num;
			
	}	
	
	void printstack(){
		top=0;
		while(top!=max){
			System.out.println(stack1[top]);
			top++;
		}		
	}		
}			