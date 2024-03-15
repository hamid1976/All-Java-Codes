class A{
	int feet;
	int inch;
	A(){
		System.out.println("I am No arg of A Const... ");
	}
	A(int a,int b){
		feet=a;
		inch=b;
		System.out.println("I am Two arg of A Const... ");
	}
}
class B extends A{
	int width;
	B(){
		System.out.println("I am No arg of B Const... ");
	}
	B(int a,int b,int c){
		super(4,5);
		feet=a;
		inch=b;
		width=c;
		System.out.println("I am Three arg of A Const... ");
	}
}
class C extends B{
	int height;
	C(){
		super(3,4,5);
		System.out.println("I am No arg of C Const... ");
	}
	C(int a,int b,int d){
		feet=a;
		inch=b;
		//width=c;
		height=d;
		System.out.println("I am Four arg of C Const... ");
	}
}	
class ConstructorPrac{
	public static void main(String arg[]){
		C ob=new C();
		//C ob1=new C(10,20,30);
	}	
}