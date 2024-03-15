class Box{
	int feet;
	int inch;
	static int counter;
	Box(int a,int b){
		feet=a;
		inch=b;
	}
}
class StaticVariable{
	public static void main(String arg[]){
		Box ob1=new Box(10,5);
		Box ob2=new Box(100,50);
	    
		Box.counter=1000;
		System.out.println("====object one=======");
		System.out.println(ob1.feet);
		System.out.println(ob1.inch);
		System.out.println(Box.counter);
		System.out.println("====object two=======");
		System.out.println(ob2.feet);
		System.out.println(ob2.inch);
		System.out.println(Box.counter);
		System.out.println("=================");
		
		ob1.counter=5000;
		System.out.println("====object one=======");
		System.out.println(ob1.feet);
		System.out.println(ob1.inch);
		System.out.println(Box.counter);
		System.out.println("====object two=======");
		System.out.println(ob2.feet);
		System.out.println(ob2.inch);
		System.out.println(Box.counter);
		System.out.println("=================");
		
		ob2.counter=7000;
		System.out.println("====object one=======");
		System.out.println(ob1.feet);
		System.out.println(ob1.inch);
		System.out.println(Box.counter);
		System.out.println("====object two=======");
		System.out.println(ob2.feet);
		System.out.println(ob2.inch);
		System.out.println(Box.counter);
		System.out.println("=================");
	}
}