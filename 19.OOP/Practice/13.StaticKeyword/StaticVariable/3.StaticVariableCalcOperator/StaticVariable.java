class Calculator{
	static int a;
	static int b;
	static int c;
	Calculator(int d,int e,char op){
		a=d;
		b=e;
		c=op;
		if(op=='+'){
			System.out.println("Addition="+(a+b));
		}
		if(op=='-'){
			System.out.println("Subtraction="+(a+b));
		}
		if(op=='*'){
			System.out.println("Multiplication="+(a+b));
		}
		if(op=='/'){
			System.out.println("Division="+(a+b));
		}
		if(op=='%'){
			System.out.println("Remainder="+(a+b));
		}
	}
}
class StaticVariable{
	public static void main(String arg[]){
		Calculator ob1=new Calculator(10,5,'+');
		Calculator ob2=new Calculator(100,78,'-');
		Calculator ob3=new Calculator(10,10,'*');
		Calculator ob4=new Calculator(60,6,'/');
		Calculator ob5=new Calculator(60,10,'%');
	}
}