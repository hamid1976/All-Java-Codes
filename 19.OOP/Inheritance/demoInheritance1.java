class A{
    A(){
		System.out.println("I am const.of A ");
	}
}
class B extends A{
	B(){
		System.out.println("I am const.of B");
	}
}
class C extends B{
	C(){
		System.out.println("I am const.of C ");
	}
}


class demoInheritance1{
	public static void main(String arg[]){
		C ob1=new C();
		
		
	}
	
}