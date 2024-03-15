import java.util.*;

class Colculator2{
	
	public static void main(String arg[]){
		
		Addition ob1=new Addition();
		Subtraction ob2=new Subtraction();
		Multiplication ob3=new Multiplication();
		Divisor ob4=new Divisor();
		Remainder ob5=new Remainder();
		
		
		Addition.add(10,10,50);
		Addition.add(10,20,5);
		Addition.add(10,20,30);
		Addition.add(10,20,30,10);
		Addition.add(1000,500);
		
		Subtraction.Sub(10,10,50);
		Subtraction.Sub(10,20,5);
		Subtraction.Sub(10,20,30);
	//	Subtraction.Sub(1000,500);
		
		Multiplication.Mul(10,10,50);
		Multiplication.Mul(10,20,5);
		Multiplication.Mul(10,20,30);
		Multiplication.Mul(1000,500);
		
		Divisor.Div(10,10,50);
		Divisor.Div(10,20,5);
		Divisor.Div(10,20,30);
		Divisor.Div(1000,500);
		
		// Remainder.Rem(10,10,50);
		// Remainder.Rem(10,20,5);
		// Remainder.Rem(10,20,30);
		Remainder.Rem(1000,500);
		
		
	}
}

class Addition{
	
	static void add(int a,int b){System.out.println(a+b);}
	
	static void add(int a, int b, int c){System.out.println(a+b+c);}
	
	static void add(int a, int b, int c,int d){System.out.println(a+b+c+d);}
	
	static void add(double a, double b){System.out.println(a+b);}
	
	static void add(double a,int b){System.out.println(a+b);}
	
	static void add(int a,double b){System.out.println(a+b);
	
	}
}

class Subtraction{
	
	static void add(int a,int b){System.out.println(a-b);}
	
	static void Sub(int a,int b,int c){System.out.println(a-b-c);}
	
	static void Sub(int a,int b,int c,int d){System.out.println(a-b-c-d);}
	
	static void Sub(double a,double b){System.out.println(a-b);}
	
	static void Sub(double a, int b){System.out.println(a-b);}
	
	static void Sub(int a,double b){System.out.println(a-b);}
}

class Multiplication{
		
	static void Mul(int a,int b){System.out.println(a*b);}
	
	static void Mul(int a,int b,int c){System.out.println(a*b*c);}
	
	static void Mul(int a,int b,int c,int d){System.out.println(a*b*c*d);}
	
	static void Mul(double a,double b){System.out.println(a*b);}
	
	static void Mul(double a, int b){System.out.println(a*b);}
	
	static void Mul(int a,double b){System.out.println(a*b);}
	
}

class Divisor{
			
	static void Div(int a,int b){System.out.println(a/b);}
	
	static void Div(int a,int b,int c){System.out.println(a/b/c);}
	
	static void Div(int a,int b,int c,int d){System.out.println(a/b/c/d);}
	
	static void Div(double a,double b){System.out.println(a/b);}
	
	static void Div(double a,int b){System.out.println(a/b);}
	
	static void Div(int a,double b){System.out.println(a/b);}
	
}

class Remainder{
				
	// static void Rem(int a,int b){System.out.println(a%b);}
	
	// static void Rem(int a,int b,int c){System.out.println(a%b%c);}
	
	// static void Rem(int a,int b,int c,int d){System.out.println(a%b%c%d);}
	
	// static void Rem(double a, double b){System.out.println(a%b);}
	
//	static void Rem(double a,double b){System.out.println(a%b);}
	
	static void Rem(int a,double b){System.out.println(a%b);}
	
}













