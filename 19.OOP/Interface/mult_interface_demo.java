interface A{
	void a();
}
interface B extends A{
	void b();
}
interface C extends B{
	void c();
}
class ABC implements C{
	public void a(){
		System.out.println("I am a()");
	}
	public void b(){
		System.out.println("I am b()");
	}
	public void c(){
		System.out.println("I am c()");
	}
}
class mult_interface_demo{
      public static void main(String arg[]){
		 ABC ob=new ABC();
		 ob.a();
		 ob.b();
		 ob.c();
		 
		  
	  }
}