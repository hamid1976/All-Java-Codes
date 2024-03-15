class A{
	A(){
	System.out.println("");
	}
}
class B extends A{
	B(){
	System.out.println("");
	}
}
class C extends B{
	C(){
	System.out.println("");
	}
}

class DemoConstructor{
	public static void main (String arg []){
		C ob = new C();
		ob.B();
	}
}