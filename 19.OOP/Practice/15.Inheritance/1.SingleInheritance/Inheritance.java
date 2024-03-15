class A{//class A is called as super class or Old Version or Father Class
	void a(){
		System.out.println("I am method of A class");
	}
}
class B extends A{//class B is called as sub class New Version or child class
	void b(){
			System.out.println("I am method of B class");
	}
}
class Inheritance{
	public static void main(String arg[]){
		B ob=new B();
		ob.a();
		ob.b();
	}
}