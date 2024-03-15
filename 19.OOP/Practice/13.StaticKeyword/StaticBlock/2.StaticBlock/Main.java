class A{
	static{
		System.out.println("I am Static Block of A class");
	}
	A(){
		System.out.println("I am Constructor of A class");
	}
}
class  Main{
	public static void main(String arg[]){
		System.out.println("I am main()method  of Main class");
		A ob1=new A();
		A ob2=new A();
		A ob3=new A();
	}
}
		
		