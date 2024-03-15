class Box{
	int feet;
	int inch;
	Box(){}
	Box(int a,int b){
		feet=a;
		inch=b;
	}
	Box add(Box ob1){
		Box ob=new Box();
		ob.feet=ob1.feet;
		ob.inch=ob1.inch;
		return ob;
	}
	Box add(Box ob1,Box ob2){
		Box ob=new Box();
		ob.feet=ob1.feet+ob2.feet;
		ob.inch=ob1.inch+ob2.inch;
		return ob;
	}
	void show(){
		System.out.println("Feet="+feet);
		System.out.println("Inch="+inch);
	}
}
class Testing{
	public static void main(String arg[]){
	Box ob1=new Box(10,5);
	Box ob2=new Box(100,50);
	Box ob3=new Box(1000,500);
	
	Box ob4=ob1.add(ob2);
	Box ob5=ob1.add(ob1,ob2);
	Box ob6=ob1.add(ob1,ob1);
	
	ob4.show();
	ob5.show();
	ob6.show();
}
}