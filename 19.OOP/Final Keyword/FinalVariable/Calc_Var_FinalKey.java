final class Calculator{
	void add(){
		final int a=50;
		final int b=5;
		System.out.println("Addition:"+(a+b));
	}

void sub(){
		final int a=20;
		final int b=10;
		System.out.println("Subtraction:"+(a-b));
	}
void mul(){
		final int a=10;
		final int b=10;
		System.out.println("Multiplication:"+(a*b));
	}
void div(){
		final int a=100;
		final int b=10;
		System.out.println("Division:"+(a/b));
	}
	
}
class Calc_Var_FinalKey{
	public static void main(String arg[]){
		Calculator ob=new Calculator();
		ob.add();
		ob.sub();
		ob.mul();
		ob.div();
	}
}