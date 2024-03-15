class A{
	private int feet;
	private int inch;
	A(){
		feet=0;
		inch=0;
		System.out.println("I am No arg of A Const... ");
	}
	A(int a,int b){
		feet=a;
		inch=b;
		System.out.println("I am Two arg of A Const... ");
	}
}
class B extends A{
	private int width;
	B(){

		width=0;
		System.out.println("I am No arg of B Const... ");
	}
	B(int a,int b,int c){
		super(a,b);
		width=c;
		System.out.println("width="+width);
		System.out.println("I am Three arg of B Const... ");
	}
}
class C extends B{
	private int height;
	C(){
		height=0;
		System.out.println("I am No arg of C Const... ");
	}
	C(int a,int b,int c,int d){
		super(a,b,c);
		height=d;
		System.out.println("I am Four arg of C Const... ");
	}
}	
class Constructor{
	public static void main(String arg[]){
		C ob=new C();
		C ob1=new C(10,20,30,40);
	}	
}