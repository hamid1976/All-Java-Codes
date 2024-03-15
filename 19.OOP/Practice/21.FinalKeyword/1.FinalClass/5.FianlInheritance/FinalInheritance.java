class A{
	void a(){
		System.out.println("I am a() method of Class A");
	}
}
class B extends A{
	void b(){
		System.out.println("I am b() method of Class B");
	}
}
final class C extends B{
	void c(){
		System.out.println("I am c() method of Class C");
	}
}
 /*class D extends C{
	void D(){
		System.out.println("Error cannot inherit fromm  Class c");
	}
}*/
class FinalInheritance{
	public static void main(String arg[]){
		C ob=new C();
		ob.a();
		ob.b();
		ob.c();
	}