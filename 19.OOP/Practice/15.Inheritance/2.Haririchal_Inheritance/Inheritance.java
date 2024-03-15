class A{
	void a(){
		System.out.println("I am method of class A");
	}
}
class B extends A{//extends keyword create the relationship b/w two classes
     void b(){
		 System.out.println("I am method of class B");
	 }
}
class C extends B{
	void c(){
		System.out.println("I am method of class C");
	}
}
class D extends C{
	void d(){
		System.out.println("I am method of class D");
	}
}
class E extends D{
	void e(){
		System.out.println("I am method of class E");
	}
}
class Inheritance{
	public static void main(String arg[]){
		E ob=new E();
		ob.e();
		ob.d();
		ob.c();
		ob.b();
		ob.a();
	}
}
