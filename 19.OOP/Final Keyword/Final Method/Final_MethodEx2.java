class A{
	 
	void Test(){
	     System.out.println("I am Test()from A Class");
		 }
    final void hello(){
        System.out.println("I am Hello()from A Class");
    }
}
class B extends A{
	 
	void Test(){
	     System.out.println("I am Override test()from B Class");
		 }
   /* final void hello(){
        System.out.println("I am Hello()from A Class");
    }*/
}

class Final_MethodEx2{
 public static void main(String arg[]){
	 B ob=new B();
	 ob.Test();
	 ob.hello();
 }
 
 }
