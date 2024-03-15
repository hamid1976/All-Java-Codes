class Rectangle{
	Rectangle(){
		System.out.println("I am Constructor of Rectangle class");
	}
	static{
		System.out.println("I am Static Block of Rectangle class");
	}
}
class Test{
	static{
		System.out.println("I am Static Block of Main class");
	}
	public static void main(String arg[]){
		
	
		System.out.println("I am main method()of main class");
		
		
		Rectangle ob2=new Rectangle();
	}
}