class Box{
	int feet;
	int inch;
	void set(int a,int b){
		feet=a;
		inch=b;
	}
	void show(){
		Display.add(this);
		Display.sub(this);
		Display.mul(this);
		Display.div(this);
		Display.rem(this);
	}
}
class Display{
	static void add(Box ob){
		System.out.println("Addition="+(ob.feet+ob.inch));
	}
	static void sub(Box ob){
		System.out.println("Subtraction="+(ob.feet-ob.inch));
	}
	static void mul(Box ob){
		System.out.println("Multiplication="+(ob.feet*ob.inch));
	}
	static void div(Box ob){
		System.out.println("Division="+(ob.feet/ob.inch));
	}
	static void rem(Box ob){
		System.out.println("Remainder="+(ob.feet/ob.inch));
	}
}
class StaticMethodThis{
	public static void main(String arg[]){
		Box ob1=new Box();
		Box ob2=new Box();
		
		ob1.set(10,5);
		ob2.set(100,50);
		
		ob1.show();
		System.out.println("===============");
		ob2.show();
	}
}