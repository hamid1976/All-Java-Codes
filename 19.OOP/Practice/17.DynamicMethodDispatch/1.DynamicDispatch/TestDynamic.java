class A{
	void callme(){
		System.out.println("I am method of A class");
	}
}
class B extends A{
	void callme(){//override
		System.out.println("I am method of B class");
	}
}
class C extends A{
	void callme(){
		System.out.println("I am method of C class");
	}
}
class TestDynamic{
	public static void main(String arg[]){
		B b=new B();
		C c=new C();
		
		A r=b;
		r.callme();
		
		r=c;
		r.callme();
		//Inheritance for generalization purpose
	}
}
	