class A{
	int feet;
	int inch;
	A(){}
	A(int a,int b){
		feet=a;
		inch=b;
	}
	void show(){
		System.out.println("Feet="+feet);
		System.out.println("Inch="+inch);
	}
}
class B extends A{
	int feet;
	int inch;
	int width;
	B(){}
	B(int a,int b,int c){
		feet=a;
		inch=b;
		width=c;
	}
	void show(){
		System.out.println("Feet="+feet);
		System.out.println("Inch="+inch);
		
		System.out.println("Width="+width);
	}
}
class C extends B{
	int feet;
	int inch;
	int width;
	int height;
	C(){}
	C(int a,int b,int c,int d){
		feet=a;
		inch=b;
		width=c;
		height=d;
	}
	void show(){
		System.out.println("Feet="+feet);
		System.out.println("Inch="+inch);
		
		System.out.println("Width="+width);
		System.out.println("Height="+height);
	}
}

class Constructor{
	public static void main(String arg[]){
		A ob=new A(10,5);
		
		B ob1=new B(10,15,20);
		
		C ob2=new C(5,10,15,20);
		ob.show();
		System.out.println("==============");
		ob1.show();
		System.out.println("==============");
		ob2.show();
	}
}