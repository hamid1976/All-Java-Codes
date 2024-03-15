import java.util.*;
class Calculator{
	void add(){
		int a=20;
		int b=10;
		System.out.println("Addition="+(a+b));
	}
	void sub(){
		int a=20;
		int b=10;
		System.out.println("Subtraction="+(a-b));
	}
	void mul(){
		int a=20;
		int b=10;
		System.out.println("Multiplication="+(a*b));
	}
	void div(){
		int a=20;
		int b=10;
		System.out.println("Division="+(a/b));
	}
}
class Test{
	public static void main(String arg[]){
		Calculator ob=new Calculator();
		Calculator ob1=ob;
		ob=null;
		ob1.add();
		ob1.sub();
		ob1.mul();
		ob1.div();
	}
}
	