import java.util.*;
class StackDemo{

 
 int top=-1;
 int data[];
 
 StackDemo(int size){
	 data=new int [size];
 }
 void push(int item){
	 data[++top]=item;
	 System.out.println(item+" pushed at "+top+" location");
 }
 void pop(){
	  System.out.println(data[top]+" pop from "+top+" location");
	  data[top]=0;
	  top--;
 }
 void traversing(){
	 for(int i=0; i<data.length; i++){
		 System.out.println(data[i]);
	 }
	 
 }
}

class Stack1stProgram{
	public static void main (String arg[]){
		StackDemo ob=new StackDemo(6);
		ob.push(10);
		ob.push(20);
		ob.push(30);
		ob.push(40);
		ob.push(50);
		ob.push(60);
		//ob.push(70);
		
		ob.pop();
		ob.pop();
		ob.pop();
		ob.pop();
		ob.pop();
		
	}
}