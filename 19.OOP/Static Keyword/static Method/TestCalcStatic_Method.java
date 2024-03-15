class calc{
	static void add(int a,int b){
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
class TestCalcStatic_Method{
	public static void main(String arg[]){
		
		calc.add(10,5);
		calc.sub(10,5);
		calc.mul(5,6);
		calc.div(100,5);
		calc.rem(100,50);
	}
}