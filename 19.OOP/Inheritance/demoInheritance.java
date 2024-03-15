class A{
	void a(){
		System.out.println("I am A class");
	}
}
class B extends A{
	void b(){
		System.out.println("I am B class");
	}
}
class C extends B{
	void c(){
		System.out.println("I am C class");
	}
}
class D extends C{
	void d(){
		System.out.println("I am D class");
	}
}
class E extends D{
	void e(){
		System.out.println("I am E class");
	}
}

class demoInheritance{
	public static void main(String arg[]){
		E  ob1=new E();
		   ob1.a();
		   ob1.b();
		   ob1.c();
		   ob1.d();
		   ob1.e();
	}
	
}