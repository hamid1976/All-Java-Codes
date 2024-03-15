class Box{
	int feet;
	int inch;
	Box(int a,int b){
		feet=a;
		inch=b;
	}
	void add(){
		System.out.println("Addition="+(feet+inch));
	}
	void add(Box ob){
		System.out.println("Addition="+(feet+ob.feet));
		System.out.println("Addition="+(inch+ob.inch));
	}
	void add(Box ob1,Box ob2){
	    System.out.println("Addition="+(feet+ob1.feet+ob2.feet));
		System.out.println("Addition="+(inch+ob2.inch+ob2.inch));
	}
}
class ObjPassArgOverloadingBox{
	public static void main(String arg[]){
		Box ob1=new Box(10,5);
		Box ob2=new Box(100,50);
		Box ob3=new Box(1000,500);
		
		ob1.add();
		ob2.add();
		ob3.add();
	    System.out.println("=========================");
		ob1.add(ob2);
		ob2.add(ob2);
		ob3.add(ob1);
		System.out.println("=========================");
		ob3.add(ob1,ob2);
    	ob2.add(ob1,ob3);
		ob1.add(ob1,ob1);
	
	}
}
		