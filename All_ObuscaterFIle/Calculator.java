import java.util.*;

class Calculator{
	
	String tempVariable="HELLO WORLD";

	Calculator(){
		System.out.println("I am Constructor and using global variable: "+tempVariable);	
	}	



	public void add(int a, int b){
		System.out.println("Addition is: "+(a+b));
	}

	public void sub(int c, int d){
		System.out.println("Subtraction is: "+(c-d));
	}

	public static void main(String[] args) {
		Calculator ob = new Calculator();
		ob.add(2,2);
		ob.sub(10,5);
	}


}