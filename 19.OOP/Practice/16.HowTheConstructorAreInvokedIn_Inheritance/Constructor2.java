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
		System.out.println("Two arg Constructor of A");
	}
	void show(){
		System.out.println("Feet="+feet);
		System.out.println("Inch="+inch);
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
		System.out.println("Three arg Constructor of B");
	}
	void show(){
		super.show();
		System.out.println("width="+width);
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
		System.out.println("Four arg Constructor of C");
	}
	void show(){
		super.show();
		System.out.println("Height="+height);
	}
}

class Constructor2{
	public static void main(String arg[]){
		C ob=new C();
		C ob1=new C(5,10,15,20);
		ob.show();
		ob1.show();
		
	}
}