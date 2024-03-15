class Box{
	int feet;
	int inch;
	static int counter;
	static{
		System.out.println("I am static block of Box class");
	}
	Box(int a,int b){
		feet=a;
		inch=b;
		System.out.println("I am Constructor of Box Class");
	}
}
class TestStaticBlock{
	static {
			System.out.println("I am static block of Main class");
	}
	public static void main(String arg[]){
			System.out.println("I am Main method");
			
			Box ob1=new Box(10,20);
			Box ob2=new Box(100,200);
	}
	}