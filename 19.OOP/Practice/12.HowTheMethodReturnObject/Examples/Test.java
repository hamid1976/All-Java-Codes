class Box{
	int feet;
	int inch;
	Box(){}
	Box(int a,int b){
		feet=a;
		inch=b;
	}
	void show(){
		System.out.println("Feet="+feet);
		System.out.println("Inch="+inch);
	}
}
class Display{
	static Box add(Box ob1,Box ob2){
		Box ob=new Box();
		ob.feet=ob1.feet+ob2.feet;
		ob.inch=ob1.inch+ob2.inch;
		return ob;
	}
}
class Test{
	public static void main(String arg[]){
		Box ob1=new Box(10,5);
		Box ob2=new Box(100,50);
		
		Box ob3=Display.add(ob1,ob2);
		ob3.show();
	}
}