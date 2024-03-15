class A{
int feet;
int inch;

 A(){
 feet=inch=0;
 System.out.println("No arg.const.of A");
 }
 A(int len){
	 feet=inch=len;
	 System.out.println("One arg.const of A");
 }
 A(int a,int b){
	 feet=a;
	 inch=b;
	 System.out.println("Two arg.const of A");
 }
 A(A ob){
	 feet=ob.feet;
	 inch=ob.inch;
	 System.out.println("obj pass As agr.const of A");
 }
 void show(){
	 System.out.println("feet:"+feet);
	 System.out.println("inch:"+inch);
 }
}
class B extends A{
	private int width;
	B(){
		width=0;
		System.out.println("No arg.const of B");
	}
	B(int len){
		super(len);
		width=len;
		System.out.println("one arg.const of B");
	}
	B(int a,int b,int c){
		super(a,b);
		width=c;
		System.out.println("Three arg.const of B");
	}
	B(B ob){
		super(ob);
		width=ob.width;
		System.out.println("obj pass As arg.const of B");
	}
	void show(){
	super.show();
	System.out.println("width:"+width);
}
}
class C extends B{
	private int height;
	C(){
		height=0;
		System.out.println("No arg.const of C");
	}
	C(int len){
		super(len);
		height=len;
		System.out.println("one arg.const of C");
	}
	C(int a, int b,int c,int d){
		super(a,b,c);
		height=d;
		System.out.println("four arg.const of C");
	}
	C(C ob){
		super(ob);
		height=ob.height;
	System.out.println("obj pass As arg.const of C");
	}
	void show(){
		super.show();
		System.out.println("height:"+height);
	}
}
 class Re_Usability{
 public static void main(String arg[]){
	 
	 C ob1=new C();
	 C ob2=new C(10);
	 C ob3=new C(100,200,300,400);
	 C ob4=new C(ob3);
	 
	 ob1.show();
	 ob2.show();
	 ob3.show();
	 ob4.show();
 }
 }
 