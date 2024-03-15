class Box{
	int feet;
	int inch;
	Box(int a,int b){
		feet=a;
		inch=b;
	}
}
class Display{
	static void add(Box ob1){
		System.out.println("Addition="+(ob1.feet+ob1.inch));
	}
	static void add(Box ob1,Box ob2){
		System.out.println("Addition="+(ob1.feet+ob1.feet));
		System.out.println("Addition="+(ob2.inch+ob2.inch));
	}
	static void add(Box ob1, Box ob2,Box ob3){
		System.out.println("Addition="+(ob1.feet+ob2.feet+ob3.feet));
		System.out.println("Addition="+(ob1.inch+ob2.inch+ob3.inch));
	}
}
class StaticConstructor{
	public static void main(String arg[]){
		Box ob1=new Box(10,20);
		Box ob2=new Box(200,100);
		
		Display.add(ob1);
		System.out.println("==============");
		Display.add(ob1,ob2);
		System.out.println("==============");
		Display.add(ob1,ob1);
		System.out.println("==============");
		Display.add(ob1,ob2,ob2);
	
	}
}