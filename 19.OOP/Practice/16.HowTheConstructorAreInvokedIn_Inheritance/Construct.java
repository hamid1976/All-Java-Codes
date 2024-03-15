class A{
	int feet;
	int inch;
	A(){
		System.out.println("I am a() ");
	}
	A(int a,int b){
		feet=a;
		inch=b;
		System.out.println("I am Two Argument of A");
	}
}
class B extends A{
	int width;
	B(){
		System.out.println("I am b()");
	}
	B(int a,int b,int c){
		feet=a;
		inch=b;
		width=c;
		System.out.println("I am Three Argument of B");
	}
}
class C extends B{
	int height;
	C(){
		System.out.println("I am c()");
	}
	C(int a,int b,int c,int d){
		feet=a;
		inch=b;
		width=c;
		height=d;
		System.out.println("I am Four Argument of C");
	}
}

class Construct{
	public static void main(String arg[]){
		C ob=new C();
		C ob1=new C(10,20,30,40);
	}
}