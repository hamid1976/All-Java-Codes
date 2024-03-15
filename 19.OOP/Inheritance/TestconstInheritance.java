class A{
	int feet;
	int inch;
	A(){
		feet=0;
		inch=0;
		System.out.println("NO arg.const.of A");
	}
	A(int len){
		feet=len;
		inch=len;
		System.out.println("One arg.const.of A");
	}
	A(int a,int b){
        feet=a;
        inch=b;	
		System.out.println("I am Two arg.const.of A");
	}
	void show(){
		System.out.println("feet:"+feet);
		System.out.println("inch:"+inch);
	}
}
class B extends A{
	int width;
	B(){
		feet=0;
		inch=0;
		width=0;
		System.out.println("NO arg.const.of B");
	}
	B(int len){
		feet=len;
		inch=len;
		width=len;
		System.out.println("I am One arg.const.of B");
	}
	B(int a,int b,int c){
        feet=a;
        inch=b;	
		width=c;
		System.out.println("I am Three arg.const.of B");
	}
	void show(){
		System.out.println("feet:"+feet);
		System.out.println("inch:"+inch);
		System.out.println("width:"+width);
	}
}
class C extends B{
	int height;
	C(){
		feet=0;
		inch=0;
		width=0;
		height=0;
		
		System.out.println("NO arg.const.of C");
	}
	C(int len){
		feet=len;
		inch=len;
		width=len;
		height=len;
		System.out.println("I am One arg.const.of C");
	}
	C(int a,int b,int c,int d){
        feet=a;
        inch=b;	
		width=c;
		height=d;
		System.out.println("I am Four arg.const.of C");
	}
	void show(){
		System.out.println("feet:"+feet);
		System.out.println("inch:"+inch);
		System.out.println("width:"+width);
		System.out.println("height:"+height);
	}
}

	
class TestconstInheritance{
	public static void main(String arg[]){
		C ob1=new C();
		C ob2=new C(10);
		C ob3=new C(100,200,300,400);
		
	}
	
}