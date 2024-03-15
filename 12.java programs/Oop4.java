import java.util.*;

class Oop4{
	
	public static void main(String arg[]){
		
		Calculator ob1=new Calculator();
		Calculator ob2=new Calculator();
		Calculator ob3=new Calculator();
		
		ob1.Set(10,5);
		ob2.Set(100,50);
		ob3.Set(1000,500);
		
		ob1.Add();
		ob2.Add();
		ob3.Add();
		
		
		
		ob1.Sub();
		ob2.Sub();
		ob3.Sub();
		
		ob1.Mul();
		ob2.Mul();
		ob3.Mul();
		
		ob1.Div();
		ob2.Div();
		ob3.Div();
		
		ob1.Rem();
		ob2.Rem();
		ob3.Rem();
		
		
	}
}



class Calculator{
	
	int v1;
	int v2;
	
	void Set(int a, int b){
		
		v1=a;
		v2=b;
	}
	
	void Add(){
		
		System.out.print("\nAddition is: "+(v1+v2));
	}
	
	void Sub(){
		
		System.out.print("\nSubtraction is: "+(v1-v2));
	}
	
	void Mul(){
		
		System.out.print("\nMultipliction is: "+v1*v2);
	}
	
	void Div(){
		
		System.out.print("\nDivisor is: "+v1/v2);
	}
	
	void Rem(){
		
		System.out.print("\nRemainder is: "+v1%v2);
	}
	
	
	
}









