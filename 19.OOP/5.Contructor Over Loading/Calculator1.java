import java.util.*;

class Calculator1{
	
	public static void main(String arg[]){
		
		Calculator.Add(10,5);
		Calculator.Sub(100,50);
		Calculator.Mul(7,3);
		Calculator.Div(9,6);
		Calculator.Rem(70,5);
		
	
		
	}

}

class Calculator{
	
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