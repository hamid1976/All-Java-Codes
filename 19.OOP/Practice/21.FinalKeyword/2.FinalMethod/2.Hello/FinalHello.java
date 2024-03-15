class A{
	void Test(){
		System.out.println("I am 1st Test");
	}
}
class B extends A{
	void Test(){
		System.out.println("I am 2nd Test");
	}
	final void Hello(){
		System.out.println("I am Hello from class B");
	}
}
class C extends B{
	void Test(){
		System.out.println("I am 3rd Test");
	}
	/*void Hello(){error cannot override hello
		System.out.println("I am Hello from class c");
	}*/
}
class FinalHello{
	public static void main(String arg[]){
		C ob=new C();
		ob.Test();
		ob.Hello();
	}
}