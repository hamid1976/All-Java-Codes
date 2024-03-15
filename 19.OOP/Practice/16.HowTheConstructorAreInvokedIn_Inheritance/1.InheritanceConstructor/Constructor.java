class A{
	
	 // A(){	
		 // System.out.println("A Constructor");
	 // }
	 A(int a){
		
	 }
}
class B extends A{
	
	B(){
		
		System.out.println("B Constructor");
	}
}
// class C extends B{
	// C(){
		
		// System.out.println("C Constructor");
	// }
// }
class Constructor{
	public static void main(String arg[]){
		B ob=new B();
	}
}