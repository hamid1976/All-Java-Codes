class Calculator{
     static void add( int a,int b){
		System.out.println("Addition:"+(a+b));
	 }
	 static void sub(int a,int b){
		System.out.println("Subtraction:"+(a-b));
	 }
	 static void mul(int a,int b){
		System.out.println("Multiplication:"+(a*b));
	 }
	 static void div(int a,int b){
	    System.out.println("Division:"+(a/b));
     }
	 static void rem(int a,int b){
	    System.out.println("Remainder:"+(a%b));
     }
	 
}
class StaticCalcMethod{
	public static void main(String arg[]){
		Calculator.add(10,5);
		Calculator.sub(10,5);
		Calculator.mul(5,6);
		Calculator.div(100,5);
		Calculator.rem(100,50);
	}
}