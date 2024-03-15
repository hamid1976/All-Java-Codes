class Box{
	int feet;
	int inch;
	int width;
	int height;
	Box(){}
	Box(int a){
		feet=a;
		System.out.println("Feet="+(feet+feet));
	}
	Box(int a,int b){
		feet=a;
		inch=b;
		System.out.println("Feet + Inch ="+(feet+inch));
	}
	Box(int a,int b,int c){
		feet=a;
		inch=b;
		width=c;
		System.out.println("Feet + Inch + Width ="+(feet+inch+width));
	}
	Box(int a,int b,int c,int d){
		feet=a;
		inch=b;
		feet=c;
		feet=d;
		System.out.println("Feet + Inch + Width +Height ="+(feet+inch+width+height));
	}
}
class Constructor{
	public static void main(String arg[]){
		Box ob=new Box();
		Box ob1=new Box(10);
		Box ob2=new Box(10,20);
		Box ob3=new Box(10,20,30);
		Box ob4=new Box(10,20,30,40);
	}
}