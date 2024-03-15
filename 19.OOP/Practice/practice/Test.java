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
		System.out.println("Feet="+(ob1.feet+ob1.feet));
		System.out.println("Inch="+(ob1.inch+ob1.inch));
	}
	static void add(Box ob1,Box ob2){
		System.out.println("Feet="+(ob1.feet+ob2.feet));
		System.out.println("Inch="+(ob1.inch+ob2.inch));
	}
	static void add(Box ob1,Box ob2,Box ob3){
		System.out.println("Feet="+(ob1.feet+ob2.feet+ob3.feet));
		System.out.println("Inch="+(ob1.inch+ob2.inch+ob3.inch));
	}
	static void add(Box ob1,Box ob2,Box ob3,Box ob4){
		System.out.println("Feet="+(ob1.feet+ob2.feet+ob3.feet+ob4.feet));
		System.out.println("Inch="+(ob1.inch+ob2.inch+ob3.feet+ob4.feet));
	}
	static void add(Box ob1,Box ob2,Box ob3,Box ob4,Box ob5){
		System.out.println("Feet="+(ob1.feet+ob2.feet+ob3.feet+ob4.feet+ob5.feet));
		System.out.println("Inch="+(ob1.inch+ob2.inch+ob3.feet+ob4.feet+ob5.inch));
	}
}
class Test{
	public static void main(String arg[]){
		Box ob1=new Box(10,5);
		Box ob2=new Box(100,50);
		Box ob3=new Box(1000,500);
		Display.add(ob1);
		Display.add(ob1,ob1);
		Display.add(ob2,ob2,ob1);
		Display.add(ob3,ob3,ob2,ob1);
		Display.add(ob1,ob2,ob3,ob1,ob2);
	}
}