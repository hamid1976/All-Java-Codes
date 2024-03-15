class Box{
	int feet;
	int inch;
	Box(int a,int b){
		feet=a;
		inch=b;
	}
	void show(){
		Display.add(this);
		Display.mul(this);
    }
}
class Display{
	static void add(Box ob){
		System.out.println("ADDITION="+(ob.feet+ob.inch));
	}
	static void mul(Box ob){
		System.out.println("MULTIPLICATION="+(ob.feet*ob.inch));
	}
}
class TestThisKeyword{
	public static void main(String arg[]){
		Box ob1=new Box(10,5);
		Box ob2=new Box(100,50);
		Box ob3=new Box(70,30);
		ob1.show();
		ob2.show();
		ob3.show();
	}
}