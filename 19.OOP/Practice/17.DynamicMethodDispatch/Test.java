class A{
	void callme(){
		System.out.println("Inside A class Method");
	}
}
class B extends A{
	void callme(){
		System.out.println("Inside B class Method");
	}
}
class C extends A {
	void callme(){
		System.out.println("Inside C class Method");
	}
}
class Test{
	public static void main(String arg[]){
		B b=new B();
		C c=new C();
		A a=new A();
		a.callme();
		a=b;
		b.callme();
		a=c;
		c.callme
	}
}