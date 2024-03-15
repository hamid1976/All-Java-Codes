import java.util.*;

class Calculator2{
	
	public static void main(String arg[]){
		
		Add(10,5);
		Sub(10,5);
		Mul(10,5);
		Div(10,5);
		Rem(10,5);
		
	}

	
	static void Add(int a, int b){
		System.out.println("Addition is: "+(a+b));
	} 
	
	static void Sub(int a, int b){
		System.out.println("Subtraction is: "+(a-b));
	} 
	
	static void Mul(int a, int b){
		System.out.println("Multiplication is: "+a*b);
	} 
	
	static void Div(int a, int b){
		
		System.out.println("Divisor is: "+a/b);
	} 
	
	static void Rem(int a, int b){
		
		System.out.println("Remainder is: "+a%b);
	} 
}