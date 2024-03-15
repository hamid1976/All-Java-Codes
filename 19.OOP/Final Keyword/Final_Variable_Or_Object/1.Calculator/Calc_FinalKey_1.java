class Calculator{
	void add(){
		 int a=50;
		 int b=5;
		System.out.println("Addition:"+(a+b));
	}

void sub(){
		 int a=20;
		 int b=10;
		System.out.println("Subtraction:"+(a-b));
	}
void mul(){
	     int a=10;
		 int b=10;
		System.out.println("Multiplication:"+(a*b));
	}
void div(){
	     int a=100;
		 int b=10;
		System.out.println("Division:"+(a/b));
	}
	
}
class Calc_FinalKey_1{
	public static void main(String arg[]){
	final	Calculator ob=new Calculator();
		ob.add();
		ob.sub();
		ob.mul();
		ob.div();
	}
}