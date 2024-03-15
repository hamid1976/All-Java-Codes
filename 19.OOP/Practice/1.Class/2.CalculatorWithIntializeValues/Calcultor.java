class Calc{
     void add(){
		int a=10;
		int b=20;
		System.out.println("Addition="+(a+b));
     }
	 void sub(){
		int a=10;
		int b=20;
		System.out.println("Subtraction="+(a-b));
     }
	 void mul(){
		int a=10;
		int b=20;
		System.out.println("Multiplication="+(a*b));
     }
	 void div(){
		int a=10;
		int b=20;
		System.out.println("Division="+(a/b));
     }
}
class Calcultor{
	public static void main(String arg[]){
		Calc ob=new Calc();
		ob.add();
		ob.sub();
		ob.mul();
		ob.div();
	}
}
	 