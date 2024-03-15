class Box{
	int feet;
	int inch;
	Box(int a,int b){
		feet=a;
		inch=b;
	}
	void add(Box ob1){
		System.out.println("Feet="+(feet+ob1.feet));
		System.out.println("Inch="+(inch+ob1.inch));
	}
	void add(Box ob1,Box ob2){
		System.out.println("Feet="+(feet+ob1.feet+ob2.feet));
		System.out.println("Inch="+(inch+ob1.inch+ob2.inch));
	}
	void add(Box ob1,Box ob2,Box ob3){
		System.out.println("Feet="+(feet+ob1.feet+ob2.feet+ob3.feet));
		System.out.println("Inch="+(inch+ob1.inch+ob2.inch+ob3.inch));
	}
}
class Test{
	public static void main(String arg[]){
		Box ob1=new Box(10,5);
		Box ob2=new Box(100,50);
		
		ob1.add(ob1);
		System.out.println("==================");
		ob2.add(ob1,ob2);
		System.out.println("==================");
		ob1.add(ob1,ob2);
		System.out.println("==================");
		ob2.add(ob1,ob2,ob2);
	}	
}
	