class Box{
	int feet;
	int inch;
	Box(){
		feet=0;
		inch=0;	
	}
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
	static Box add(Box obj1,Box obj2){
		Box ob=new Box();
		ob.feet=obj1.feet+obj2.feet;
		ob.inch=obj1.inch+obj2.inch;
		return ob;
	}
}
	
	

class ObjectReturnValue{
	public static void main(String arg[]){
	Box ob1=new Box(10,5);
	Box ob2=new Box(100,50);
	
	Box ob3=Display.add(ob1,ob2);
	Box ob4=Display.add(ob1,ob1);
	Box ob5=Display.add(ob2,ob2);
	
	ob3.show();
	ob4.show();
	ob5.show();
	}
}