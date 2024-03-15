class A{
	void a(){
		System.out.println("I am a() method of A class");
	}
    void b(){
		System.out.println("I am b() method of A class");
	}
	void c(){
		System.out.println("I am c() method of A class");
	}
}
class B{
	void a(){
		System.out.println("I am a() method of B class");
	}
    void b(){
		System.out.println("I am b() method of B class");
	}
	void c(){
		System.out.println("I am c() method of B class");
	}
}
class C{
    void a(){
		System.out.println("I am a() method of C class");
	}
    void b(){
		System.out.println("I am b() method of C class");
	}
	void c(){
		System.out.println("I am c() method of C class");
	}
}
class Class1{
	public static void main(String arg[]){
		A ob=new A();
		B ob1=new B();
		C ob2=new C();
		
		ob.a();
		ob.b();
		ob.c();
		
		ob1.a();
		ob1.b();
		ob1.c();
		
		ob2.a();
		ob2.b();
		ob2.c();
	}
}